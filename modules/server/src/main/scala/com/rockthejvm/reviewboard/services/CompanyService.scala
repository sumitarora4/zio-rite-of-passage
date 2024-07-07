package com.rockthejvm.reviewboard.services

import zio.* 
import collection.mutable
import com.rockthejvm.reviewboard.domain.data.*
import com.rockthejvm.reviewboard.http.requests.CreateCompanyRequest


// Business Logic
// between http and db layer
trait CompanyService {
  
def create(req: CreateCompanyRequest): Task[Company]
def getAll: Task[List[Company]]
def getById(id: Long): Task[Option[Company]]
def getBySlug(slug: String): Task[Option[Company]]
}

object CompanyService {
    val dummyLayer = ZLayer.succeed(new CompanyServiceDummy)
}

class CompanyServiceDummy extends CompanyService {
    val db = mutable.Map[Long, Company]()  

    override def create(req: CreateCompanyRequest): Task[Company] =   
    ZIO.succeed {
      val newId = db.keys.maxOption.getOrElse(0L) + 1
      val slug  = Company.makeSlug(req.name)
      val newCompany = req.toCompany(1)
      db += (newId -> newCompany)
      newCompany
    }

    override def getAll: Task[List[Company]] = 
        ZIO.succeed(db.values.toList)

    override def getById(id: Long): Task[Option[Company]] = 
        ZIO.succeed(db.get(id))

    override def getBySlug(slug: String): Task[Option[Company]] = 
        ZIO.succeed(db.values.find(_.slug == slug))
}