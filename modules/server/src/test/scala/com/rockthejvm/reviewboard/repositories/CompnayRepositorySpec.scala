package com.rockthejvm.reviewboard.repositories

import zio.* 
import zio.test.* 

import com.rockthejvm.reviewboard.syntax.* 
import com.rockthejvm.reviewboard.domain.data.Company
import org.testcontainers.containers.PostgreSQLContainer
import javax.sql.DataSource
import org.postgresql.ds.PGSimpleDataSource

object CompnayRepositorySpec extends ZIOSpecDefault{
      override def spec: Spec[TestEnvironment & Scope, Any] =  
        suite("CompanyRepsitorySpec")(
            test("create a compnay"){
                val program = for {
                    repo <- ZIO.service[CompanyRepository]
                    company <- repo.create(Company(1L, "rock-the-jvm","Rock the JVM", "rockthejvm.com"))
                } yield company

                program.assert{
                    case Company(_,"rock-the-jvm","Rock the JVM", "rockthejvm.com",_, _, _, _, _) => true
                    case _ => false
                }
            }
        ).provide(
            CompanyRepositoryLive.layer,
            dataSourceLayer,
            Repository.quillLayer,
            Scope.default
        )
        
        // test Container
        // spawn a Postgres instance on Docker just for test
        def createContainer(): PostgreSQLContainer[Nothing] = {
            val container: PostgreSQLContainer[Nothing] = 
                PostgreSQLContainer("postgres").withInitScript("sql/companies.sql") // Todo: store this under src/test/resources

             container.start()
             container
        }

        def closeContainer(container: PostgreSQLContainer[Nothing]) = {
            container.stop()
        }

        // Create a datasource to connect to postgres
        def createDataSource(container: PostgreSQLContainer[Nothing]): DataSource = {
            val datasouce = new PGSimpleDataSource()
            datasouce.setUrl(container.getJdbcUrl())
            datasouce.setUser(container.getUsername())
            datasouce.setPassword(container.getPassword())
            datasouce
        }

        // use the datasource to build the quill instance(as a zlayer)
        val dataSourceLayer = ZLayer {
            for {
                container <- ZIO.acquireRelease(ZIO.attempt(createContainer()))(container => ZIO.attempt(container.stop).ignoreLogged)
                dataSource <- ZIO.attempt(createDataSource(container))
            } yield dataSource
        }
}
