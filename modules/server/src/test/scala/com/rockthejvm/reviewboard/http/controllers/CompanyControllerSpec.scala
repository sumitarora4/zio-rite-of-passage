package com.rockthejvm.reviewboard.http.controllers


import zio.*
import zio.test.*
import sttp.tapir.server.stub.TapirStubInterpreter
import sttp.client3.testing.SttpBackendStub
import sttp.monad.MonadError
import sttp.tapir.ztapir.RIOMonadError

import com.rockthejvm.reviewboard.http.requests.CreateCompanyRequest
import com.rockthejvm.reviewboard.domain.data.Company

import zio.json.*
import sttp.tapir.generic.auto.*
import sttp.client3.*

object CompanyControllerSpec extends ZIOSpecDefault {

  private given zioMe: MonadError[Task] = new RIOMonadError[Any]
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

          // create the controller
          controller <- CompanyController.makeZIO

          // build tapir backend
          backendStub <- ZIO.succeed(TapirStubInterpreter(SttpBackendStub(MonadError[Task]))
            .whenServerEndpointRunLogic(controller.create)
            .backend()
          )

          // run http request
          response <- basicRequest
            .post(uri"/companies")
            .body(CreateCompanyRequest(1,"rock_the_jvm","Rock the Jvm","rockthejvm.com").toJson)
            .send(backendStub)
        } yield response.body

          // inspect http response
          assertZIO(program)(
            Assertion.assertion("inspect the http request from getAll"){ 
              respBody => respBody.toOption
              .flatMap(_.fromJson[Company].toOption)
              .contains(Company(1,"rock_the_jvm","Rock the Jvm","rockthejvm.com"))
            }
          )


      }


    )
  }
}
