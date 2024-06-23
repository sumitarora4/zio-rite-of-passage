package com.rockthejvm.reviewboard.http.controllers

import com.rockthejvm.reviewboard.http.endpoints.CompanyEndpoints
import collection.mutable
import com.rockthejvm.reviewboard.domain.data.Company
import zio.ZIO
import sttp.tapir.server.ServerEndpoint
import zio.Task

class CompanyController private extends CompanyEndpoints with BaseController{

  // Todo implementations
  // in-memory "database"

  val db = mutable.Map[Long, Company](
    // -1L -> Company(-1L, "invalid", "No Company", "nothing.com")
  )

// create
  val create: ServerEndpoint[Any, zio.Task] = createEndpoint.serverLogicSuccess{ req =>
    ZIO.succeed {
      val newId = db.keys.maxOption.getOrElse(0L) + 1
      val slug  = Company.makeSlug(req.name)
      val newCompany = req.toCompany(1)
      db += (newId -> newCompany)
      newCompany
    }
  }

  // getAll
  val getAll: ServerEndpoint[Any, zio.Task] = getAllEndpoint.serverLogicSuccess(_ => ZIO.succeed(db.values.toList))

  // getById
  val getById: ServerEndpoint[Any, zio.Task] = getByIdEndpoint.serverLogicSuccess{ id =>
    ZIO.attempt(id.toLong)
    .map(db.get)
  }

  override val routes: List[ServerEndpoint[Any, Task]] = List(create, getAll, getById)

}

object CompanyController{
  val makeZIO = ZIO.succeed(new CompanyController)
}
