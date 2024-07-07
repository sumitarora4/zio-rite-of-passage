package com.rockthejvm.reviewboard.http.controllers

import com.rockthejvm.reviewboard.http.endpoints.CompanyEndpoints
import collection.mutable
import com.rockthejvm.reviewboard.domain.data.Company
import zio.ZIO
import sttp.tapir.server.ServerEndpoint
import zio.Task
import com.rockthejvm.reviewboard.services.CompanyService
import com.rockthejvm.reviewboard.services.CompanyServiceDummy

class CompanyController private (service: CompanyService) extends CompanyEndpoints with BaseController{

  // Todo implementations
  // in-memory "database"

// create
  val create: ServerEndpoint[Any, zio.Task] = createEndpoint.serverLogicSuccess{ req =>
    service.create(req)
  }

  // getAll
  val getAll: ServerEndpoint[Any, zio.Task] = getAllEndpoint.serverLogicSuccess(_ => 
    service.getAll
  )

  // getById
  val getById: ServerEndpoint[Any, zio.Task] = getByIdEndpoint.serverLogicSuccess{ id =>
    ZIO.attempt(id.toLong)
    .flatMap (service.getById)
    .catchSome{
      case _: java.lang.NumberFormatException => service.getBySlug(id)
    }
    // TODO:
  }

  override val routes: List[ServerEndpoint[Any, Task]] = List(create, getAll, getById)

}

object CompanyController { 

  val makeZIO = for {

    service <- ZIO.service[CompanyService]

} yield new CompanyController(service)
}
