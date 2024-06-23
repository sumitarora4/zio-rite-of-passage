package com.rockthejvm.reviewboard.http.requests

import zio.json.JsonCodec
import zio.json.DeriveJsonCodec
import com.rockthejvm.reviewboard.domain.data.Company

final case class CreateCompanyRequest(
    id: Long,
    slug: String,
    name: String,
    url: String,
    country: Option[String] = None,
    location: Option[String] = None,
    industry: Option[String] = None,
    image: Option[String] = None,
    tags: Option[List[String]] = None
) {
  def toCompany(id: Long) = {
    Company(id, Company.makeSlug(name), name, url, country, location, industry, image, tags.getOrElse(List()))
  }
}

object CreateCompanyRequest {
  given codec: JsonCodec[CreateCompanyRequest] = DeriveJsonCodec.gen[CreateCompanyRequest]
}
