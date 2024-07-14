package com.rockthejvm.reviewboard.http.repositories

import zio.*; 
import io.getquill.*
import io.getquill.jdbczio.Quill    

import com.rockthejvm.reviewboard.domain.data.Company

trait CompanyRepository {
  
    def create(company: Company): Task[Company]
    def update(id: Long, op:Company => Company): Task[Company]
    def delete(id: Long): Task[Option[Company]]
    def getById(id: Long): Task[Option[Company]]
    def getBySlug(slug: String): Task[Option[Company]]
    def get:Task[List[Company]]

}

class CompanyRepositoryLive(quill: Quill.Postgres[SnakeCase]) extends CompanyRepository{
    import quill.* 

    given schema: SchemaMeta[Company] = schemaMeta[Company]("companies") // table name
    given insSchema: InsertMeta[Company] = insertMeta[Company](_.id)
    given upSchema: UpdateMeta[Company] = updateMeta[Company](_.id)

    override def create(company: Company): Task[Company] = ???
    override def update(id: Long, op:Company => Company): Task[Company] = ???
    override def delete(id: Long): Task[Option[Company]] = ???
    override def getById(id: Long): Task[Option[Company]] = ???
    override def getBySlug(slug: String): Task[Option[Company]] = ???
    override def get:Task[List[Company]] = ???
}
