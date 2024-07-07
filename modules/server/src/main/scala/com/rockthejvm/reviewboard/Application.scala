package com.rockthejvm.reviewboard

import sttp.tapir.*
import sttp.tapir.server.ServerEndpoint
import sttp.tapir.server.ziohttp.{ZioHttpInterpreter, ZioHttpServerOptions}
import zio.*
import zio.http.Server
import com.rockthejvm.reviewboard.http.controllers.HealthController
import com.rockthejvm.reviewboard.http.controllers.CompanyController
import com.rockthejvm.reviewboard.http.HttpApi
import com.rockthejvm.reviewboard.services.CompanyService

object Application extends ZIOAppDefault {

  val serverProgram =
    for {
      // healthController <- HealthController.makeZIO
      // companyController <- CompanyController.makeZIO
      endpoints <- HttpApi.endpointsZIO
      _ <- Server.serve(
        ZioHttpInterpreter(
          ZioHttpServerOptions.default // can add configs e.g. CORS
        ).toHttp(endpoints)
      )

      _ <- Console.printLine("Rock the jvm...")
    } yield ()
  override def run = serverProgram.provide(
    Server.default,
    CompanyService.dummyLayer
    )
}
