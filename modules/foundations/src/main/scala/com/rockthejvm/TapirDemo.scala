package com.rockthejvm

import sttp.tapir.*
import sttp.tapir.generic.auto.*
import sttp.tapir.json.zio.jsonBody
import sttp.tapir.server.ServerEndpoint
import sttp.tapir.server.ziohttp.{ZioHttpInterpreter, ZioHttpServerOptions}
import zio.*
import zio.http.Server
import zio.json.{DeriveJsonCodec, JsonCodec}

import scala.collection.mutable

object TapirDemo  extends ZIOAppDefault{

  val simplestEndpoint = endpoint
    .tag("simple")
    .name("simple")
    .description("simplest endpoint possible")
  // ^^ for documentation
    .get // http method
    .in("simple") //  path
    .out(plainBody[String]) // output
    .serverLogicSuccess[Task](_ => ZIO.succeed("All good!"))

  val simpleServerProgram = Server.serve(
    ZioHttpInterpreter(
    ZioHttpServerOptions.default // can add configs e.g. CORS
  ).toHttp(simplestEndpoint)
  )

  // simulate a job board
  val db: mutable.Map[Long, Job] = mutable.Map(
    1L -> Job(1L, "Instructor", "rockthejvm.com", "Rock the JVM")
  )

  // create
  val createEndpoint: ServerEndpoint[Any, Task]= endpoint
    .tag("jobs")
    .name("create")
    .description("create a jobs")
    .in("jobs")
    .post
    .in(jsonBody[CreateJobRequest])
    .out(jsonBody[Job])
    .serverLogicSuccess(req => ZIO.succeed{
      // insert a new job in db
      val newId = db.keys.max + 1
      val newJob = Job(newId, req.title, req.url, req.company)
      db += (newId -> newJob)
      newJob
      })

  // get by Id
  val getByIdEndpoint: ServerEndpoint[Any, Task] = endpoint
    .tag("jobs")
    .name("getById")
    .description("get jobs by id")
    .in("jobs" / path[Long]("id"))
    .get
    .out(jsonBody[Option[Job]])
    .serverLogicSuccess(id => ZIO.succeed(db.get(id)))

  // get all
  val getAllEndpoint: ServerEndpoint[Any, Task] = endpoint
    .tag("jobs")
    .name("getAll")
    .description("get all jobs")
    .in("jobs")
    .get
    .out(jsonBody[List[Job]])
    .serverLogicSuccess(_=>ZIO.succeed(db.values.toList))


  val serverProgram = Server.serve(
    ZioHttpInterpreter(
      ZioHttpServerOptions.default // can add configs e.g. CORS
    ).toHttp(List(createEndpoint, getByIdEndpoint, getAllEndpoint))
  )


  

  def run: ZIO[Any, Throwable, Nothing] = serverProgram.provide(
    Server.default // without other config, server should start at 0.0.0.0:8080
  )
}



case class Job(
    in: Long,
    title: String,
    url: String,
    company: String
              )

object Job{
  given codec:JsonCodec[Job] = DeriveJsonCodec.gen[Job] // macro based Json codec(generated)
}

// special request for the HTTP endpoint
case class CreateJobRequest(
    title: String,
    url: String,
    company: String
                           )

object CreateJobRequest{
  given codec: JsonCodec[CreateJobRequest] = DeriveJsonCodec.gen[CreateJobRequest]
}

