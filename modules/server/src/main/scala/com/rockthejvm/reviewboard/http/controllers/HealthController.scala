package com.rockthejvm.reviewboard.http.controllers

import zio.*
import com.rockthejvm.reviewboard.http.endpoints.HealthEndpoint
import sttp.tapir.server.ServerEndpoint

class HealthController extends HealthEndpoint with BaseController {

  val health = healthEndpoint.serverLogicSuccess[Task](_ => ZIO.succeed("All good!"))

  override val routes: List[ServerEndpoint[Any, Task]] = List(health)

}

object HealthController {
  val makeZIO = ZIO.succeed(new HealthController)
}
