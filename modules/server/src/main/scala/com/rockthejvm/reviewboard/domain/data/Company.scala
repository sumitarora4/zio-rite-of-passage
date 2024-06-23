package com.rockthejvm.reviewboard.domain.data

import zio.json.JsonCodec
import zio.json.DeriveJsonCodec

final case class Company(
    id: Long,
    slug: String,
    name: String,
    url: String,
    country: Option[String]= None,
    location: Option[String] = None,
    industry: Option[String] = None,
    image: Option[String] = None,
    tag: List[String] = List()
)

 object Company {
        given Codec: JsonCodec[Company] = DeriveJsonCodec.gen[Company]

        def makeSlug(name: String): String = name
          .replaceAll(" +", " ")
          .split(" ")
          .map(_.toLowerCase())
          .mkString("_") // "My Company  Inc" -> "my-company-inc"
    }
