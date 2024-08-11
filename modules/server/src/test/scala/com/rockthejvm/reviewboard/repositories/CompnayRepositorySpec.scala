package com.rockthejvm.reviewboard.repositories

import zio.* 
import zio.test.* 

import com.rockthejvm.reviewboard.syntax.* 
import com.rockthejvm.reviewboard.domain.data.Company

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
        )


}
