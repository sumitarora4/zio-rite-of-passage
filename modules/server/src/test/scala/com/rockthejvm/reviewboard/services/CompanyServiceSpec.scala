package com.rockthejvm.reviewboard.services

import com.rockthejvm.reviewboard.domain.data.Company
import com.rockthejvm.reviewboard.http.requests.CreateCompanyRequest
import com.rockthejvm.reviewboard.repositories.CompanyRepository
import zio.{Task, *}
import zio.test.*
import com.rockthejvm.reviewboard.syntax.*

import scala.collection.immutable.List

import scala.collection.mutable.Map

object CompanyServiceSpec extends ZIOSpecDefault{

 val service = ZIO.serviceWithZIO[CompanyService]

 val stubRepoLayer = ZLayer.succeed(
   a = new CompanyRepository {
     val db = Map[Long, Company]()

     override def create(company: Company): Task[Company] = {
       ZIO.succeed {
         val nextId = db.keys.maxOption.getOrElse(0L) + 1
         val newCompany = company.copy(id = nextId)
         db += (nextId -> newCompany)
         newCompany
       }
     }

     override def update(id: Long, op: Company => Company): Task[Company] = {
       ZIO.attempt {
         val company = db(id)
         db += (id -> op(company))
         company
       }
     }

     override def delete(id: Long): Task[Company] = {
       ZIO.attempt {
         val company = db(id)
         db -= id
         company
       }
     }

     override def getById(id: Long): Task[Option[Company]] = ZIO.succeed(db.get(id))

     override def getBySlug(slug: String): Task[Option[Company]] = {
       ZIO.succeed(db.values.find(_.slug == slug))
     }

     override def get: Task[List[Company]] = {
       ZIO.succeed(db.values.toList)
     }
   }
 )

  override def spec: Spec[TestEnvironment with Scope, Any] = {
    suite("CompanyServiceSpec"){
      test("Create"){
        val companyZio = service(_.create(CreateCompanyRequest(1L,"", "Rock the JVM", "rockthejvm.com")))
        companyZio.assert { company =>
          company.name == "Rock the JVM" &&
            company.url == "rockthejvm.com" &&
            company.slug == "rock_the_jvm"
        }
      }
    }.provide(CompanyServiceLive.layer, stubRepoLayer)
  }
}
