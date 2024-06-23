package com.rockthejvm.reviewboard.http

import com.rockthejvm.reviewboard.http.controllers.HealthController
import com.rockthejvm.reviewboard.http.controllers.CompanyController
import com.rockthejvm.reviewboard.http.controllers.BaseController

object HttpApi {

  // Todo gather routes

  def gatherRoutes(controllers: List[BaseController]) = controllers.flatMap(_.routes)

  def makeControllers = for {
    health    <- HealthController.makeZIO
    companies <- CompanyController.makeZIO
    // add new controllers here
  } yield List(health, companies)

  val endpointsZIO = makeControllers.map(gatherRoutes)

}
