package com.rockthejvm.reviewboard.http.controllers

import zio.*
import zio.test.*
import sttp.tapir.server.stub.TapirStubInterpreter
import sttp.client3.testing.SttpBackendStub
import sttp.monad.MonadError
import sttp.tapir.ztapir.RIOMonadError

import zio.json.*
import sttp.tapir.generic.auto.*
import sttp.client3.*
import sttp.tapir.server.ServerEndpoint

import com.rockthejvm.reviewboard.http.requests.CreateCompanyRequest
import com.rockthejvm.reviewboard.domain.data.Company
import com.rockthejvm.reviewboard.syntax.*
import com.rockthejvm.reviewboard.services.CompanyService

object CompanyControllerSpec extends ZIOSpecDefault {

  private given zioMe: MonadError[Task] = new RIOMonadError[Any]

  val rtjvm = Company(1, "rock_the_jvm", "Rock the Jvm", "rockthejvm.com")
  private val serviceStub = new CompanyService {
    override def create(req: CreateCompanyRequest): Task[Company] =
      ZIO.succeed(rtjvm)

    override def getById(id: Long): Task[Option[Company]] =
      ZIO.succeed(
        if (id == 1) Some(rtjvm)
        else None
      )

    override def getBySlug(slug: String): Task[Option[Company]] =
      ZIO.succeed(
        if (slug == rtjvm.slug) Some(rtjvm)
        else None
      )
    override def getAll: Task[List[Company]] =
      ZIO.succeed(List(rtjvm))
  }

  private def backEndStubZIO(endpointFun: CompanyController => ServerEndpoint[Any, Task]) = for {
    // create the controller
    controller <- CompanyController.makeZIO

    // build tapir backend
    backendStub <- ZIO.succeed(
      TapirStubInterpreter(SttpBackendStub(MonadError[Task]))
        .whenServerEndpointRunLogic(endpointFun(controller))
        .backend()
    )
  } yield backendStub
  override def spec: Spec[TestEnvironment & Scope, Any] = {
    suite("Company Controller Test")(
      // test("simple test") {
      //   // code under test sdf
      //   assertZIO(ZIO.succeed(1 + 1))(
      //     Assertion.assertion("basic math")(_ == 2)
      //   )
      // },
      test("post company") {
        val program = for {

          backendStub <- backEndStubZIO(_.create)

          // run http request
          response <- basicRequest
            .post(uri"/companies")
            .body(CreateCompanyRequest(1, "rock_the_jvm", "Rock the Jvm", "rockthejvm.com").toJson)
            .send(backendStub)
        } yield response.body

        // inspect http response
        program.assert { respBody =>
          respBody.toOption
            .flatMap(_.fromJson[Company].toOption)
            .contains(Company(1, "rock_the_jvm", "Rock the Jvm", "rockthejvm.com"))
        }
      },
      test("get All") {
        val program = for {
          backendStub <- backEndStubZIO(_.getAll)
          // run http request
          response <- basicRequest
            .get(uri"/companies")
            .send(backendStub)
        } yield response.body

        // inspect http response
        program.assert { respBody =>
          respBody.toOption
            .flatMap(_.fromJson[List[Company]].toOption)
            .contains(List(rtjvm))
        }
      },
      test("get by id") {
        val program = for {
          backendStub <- backEndStubZIO(_.getById)

          // run http request
          response <- basicRequest
            .get(uri"/companies/1")
            .send(backendStub)
        } yield response.body

        // inspect http response
        program.assert { respBody =>
          respBody.toOption
            .flatMap(_.fromJson[Company].toOption)
            .contains(rtjvm)
        }
      }
    )
  }
    .provide(ZLayer.succeed(serviceStub))
}
