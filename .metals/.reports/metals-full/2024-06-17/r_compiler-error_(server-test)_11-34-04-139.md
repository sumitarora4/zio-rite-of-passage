jar:file://<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/client3/core_3/3.8.8/core_3-3.8.8-sources.jar!/sttp/client3/SttpApi.scala
### dotty.tools.dotc.core.RecursionOverflow: Recursion limit exceeded.
Maybe there is an illegal cyclic reference?
If that's not the case, you could also try to increase the stacksize using the -Xss JVM option.
For the unprocessed stack trace, compile with -Yno-decode-stacktraces.
A recurring operation is (inner to outer):

  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  ...

  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<WORKSPACE>/.bloop/server/bloop-bsp-clients-classes/test-classes-Metals-WUldccDhRXy1zp504sg8-g== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.10/semanticdb-javac-0.9.10.jar [exists ], <WORKSPACE>/.bloop/server/bloop-bsp-clients-classes/classes-Metals-WUldccDhRXy1zp504sg8-g== [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.1/scala3-library_3-3.3.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-sttp-client_3/1.2.6/tapir-sttp-client_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-json-zio_3/1.2.6/tapir-json-zio_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/client3/zio_3/3.8.8/zio_3-3.8.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-json_3/0.6.2/zio-json_3-0.6.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-zio_3/1.2.6/tapir-zio_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-zio-http-server_3/1.2.6/tapir-zio-http-server_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-swagger-ui-bundle_3/1.2.6/tapir-swagger-ui-bundle_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-sttp-stub-server_3/1.2.6/tapir-sttp-stub-server_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-logging_3/2.1.8/zio-logging_3-2.1.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-logging-slf4j_3/2.1.8/zio-logging-slf4j_3-2.1.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.4.4/logback-classic-1.4.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-test_3/2.0.19/zio-test_3-2.0.19.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-test-junit_3/2.0.19/zio-test-junit_3-2.0.19.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-test-sbt_3/2.0.19/zio-test-sbt_3-2.0.19.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-test-magnolia_3/2.0.19/zio-test-magnolia_3-2.0.19.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-mock_3/1.0.0-RC9/zio-mock_3-1.0.0-RC9.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-config_3/3.0.7/zio-config_3-3.0.7.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-config-magnolia_3/3.0.7/zio-config-magnolia_3-3.0.7.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-config-typesafe_3/3.0.7/zio-config-typesafe_3-3.0.7.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/getquill/quill-jdbc-zio_3/4.7.3/quill-jdbc-zio_3-4.7.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/postgresql/postgresql/42.5.0/postgresql-42.5.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/flywaydb/flyway-core/9.7.0/flyway-core-9.7.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/github/scottweaver/zio-2-0-testcontainers-postgresql_3/0.9.0/zio-2-0-testcontainers-postgresql_3-0.9.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-prelude_3/1.0.0-RC16/zio-prelude_3-1.0.0-RC16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/auth0/java-jwt/4.2.1/java-jwt-4.2.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/sun/mail/javax.mail/1.6.2/javax.mail-1.6.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/stripe/stripe-java/24.3.0/stripe-java-24.3.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.11/scala-library-2.13.11.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-client_3/1.2.6/tapir-client_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/client3/core_3/3.8.8/core_3-3.8.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-core_3/1.2.6/tapir-core_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-streams_3/2.0.19/zio-streams_3-2.0.19.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio_3/2.0.19/zio_3-2.0.19.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/shared/zio_3/1.3.12/zio_3-1.3.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-interop-reactivestreams_3/2.0.0/zio-interop-reactivestreams_3-2.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-collection-compat_3/2.11.0/scala-collection-compat_3-2.11.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/magnolia1_3/magnolia_3/1.3.3/magnolia_3-1.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-server_3/1.2.6/tapir-server_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-http_3/0.0.3/zio-http_3-0.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-swagger-ui_3/1.2.6/tapir-swagger-ui_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-openapi-docs_3/1.2.6/tapir-openapi-docs_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/apispec/openapi-circe-yaml_3/0.3.2/openapi-circe-yaml_3-0.3.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/2.0.1/slf4j-api-2.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-core/1.4.4/logback-core-1.4.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/portable-scala/portable-scala-reflect_2.13/1.1.2/portable-scala-reflect_2.13-1.1.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/test-interface/1.0/test-interface-1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-config-derivation_3/3.0.7/zio-config-derivation_3-3.0.7.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.2/config-1.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/getquill/quill-zio_3/4.7.3/quill-zio_3-4.7.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/getquill/quill-sql_3/4.7.3/quill-sql_3-4.7.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/getquill/quill-jdbc_3/4.7.3/quill-jdbc_3-4.7.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_3/1.0.2/scala-java8-compat_3-1.0.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/zaxxer/HikariCP/4.0.3/HikariCP-4.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/checkerframework/checker-qual/3.5.0/checker-qual-3.5.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-toml/2.13.4/jackson-dataformat-toml-2.13.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/github/scottweaver/zio-testcontainers-models_3/0.9.0/zio-testcontainers-models_3-0.9.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/github/scottweaver/zillen_3/0.9.0/zillen_3-0.9.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/dimafeng/testcontainers-scala-core_3/0.40.10/testcontainers-scala-core_3-0.40.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/dimafeng/testcontainers-scala-postgresql_3/0.40.10/testcontainers-scala-postgresql_3-0.40.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-prelude-macros_3/1.0.0-RC16/zio-prelude-macros_3-1.0.0-RC16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.13.4.2/jackson-databind-2.13.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/javax/activation/activation/1.1/activation-1.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/model/core_3/1.5.4/core_3-1.5.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/shared/core_3/1.3.12/core_3-1.3.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/shared/ws_3/1.3.12/ws_3-1.3.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-internal-macros_3/2.0.19/zio-internal-macros_3-2.0.19.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-stacktracer_3/2.0.19/zio-stacktracer_3-2.0.19.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/izumi-reflect_3/2.3.8/izumi-reflect_3-2.3.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.4/reactive-streams-1.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-http-logging_3/0.0.3/zio-http-logging_3-0.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-codec-http/4.1.82.Final/netty-codec-http-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-handler-proxy/4.1.82.Final/netty-handler-proxy-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-transport-native-epoll/4.1.82.Final/netty-transport-native-epoll-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-transport-native-epoll/4.1.82.Final/netty-transport-native-epoll-4.1.82.Final-linux-x86_64.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-transport-native-epoll/4.1.82.Final/netty-transport-native-epoll-4.1.82.Final-linux-aarch_64.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-transport-native-kqueue/4.1.82.Final/netty-transport-native-kqueue-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-transport-native-kqueue/4.1.82.Final/netty-transport-native-kqueue-4.1.82.Final-osx-x86_64.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-transport-native-kqueue/4.1.82.Final/netty-transport-native-kqueue-4.1.82.Final-osx-aarch_64.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-schema_3/0.2.1/zio-schema_3-0.2.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-schema-json_3/0.2.1/zio-schema-json_3-0.2.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/incubator/netty-incubator-transport-native-io_uring/0.0.15.Final/netty-incubator-transport-native-io_uring-0.0.15.Final-linux-x86_64.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/webjars/swagger-ui/4.15.5/swagger-ui-4.15.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/tapir/tapir-apispec-docs_3/1.2.6/tapir-apispec-docs_3-1.2.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/quicklens/quicklens_3/1.9.0/quicklens_3-1.9.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/apispec/openapi-model_3/0.3.2/openapi-model_3-0.3.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/apispec/openapi-circe_3/0.3.2/openapi-circe_3-0.3.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/circe/circe-yaml_3/0.14.2/circe-yaml_3-0.14.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/suzaku/boopickle_3/1.4.0/boopickle_3-1.4.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/pprint_3/0.8.1/pprint_3-0.8.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/getquill/quill-engine_3/4.7.3/quill-engine_3-4.7.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/getquill/quill-util_3/4.7.3/quill-util_3-4.7.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/scala-logging/scala-logging_3/3.9.5/scala-logging_3-3.9.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.13.4/jackson-core-2.13.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-handler/4.1.82.Final/netty-handler-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/testcontainers/testcontainers/1.17.3/testcontainers-1.17.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/dimafeng/testcontainers-scala-jdbc_3/0.40.10/testcontainers-scala-jdbc_3-0.40.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/testcontainers/postgresql/1.17.3/postgresql-1.17.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.13.4/jackson-annotations-2.13.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/izumi-reflect-thirdparty-boopickle-shaded_3/2.3.8/izumi-reflect-thirdparty-boopickle-shaded_3-2.3.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-common/4.1.82.Final/netty-common-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-buffer/4.1.82.Final/netty-buffer-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-transport/4.1.82.Final/netty-transport-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-codec/4.1.82.Final/netty-codec-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-codec-socks/4.1.82.Final/netty-codec-socks-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-transport-native-unix-common/4.1.82.Final/netty-transport-native-unix-common-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-transport-classes-epoll/4.1.82.Final/netty-transport-classes-epoll-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-transport-classes-kqueue/4.1.82.Final/netty-transport-classes-kqueue-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-schema-macros_3/0.2.1/zio-schema-macros_3-0.2.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dev/zio/zio-schema-derivation_3/0.2.1/zio-schema-derivation_3-0.2.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/incubator/netty-incubator-transport-classes-io_uring/0.0.15.Final/netty-incubator-transport-classes-io_uring-0.0.15.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/apispec/asyncapi-model_3/0.3.2/asyncapi-model_3-0.3.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/apispec/apispec-model_3/0.3.2/apispec-model_3-0.3.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/apispec/jsonschema-circe_3/0.3.2/jsonschema-circe_3-0.3.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/circe/circe-core_3/0.14.3/circe-core_3-0.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/yaml/snakeyaml/1.33/snakeyaml-1.33.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/fansi_3/0.4.0/fansi_3-0.4.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/sourcecode_3/0.3.0/sourcecode_3-0.3.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/github/takayahilton/sql-formatter_2.13/1.2.1/sql-formatter_2.13-1.2.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scalameta/scalafmt-core_2.13/3.7.14/scalafmt-core_2.13-3.7.14.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parallel-collections_3/1.0.4/scala-parallel-collections_3-1.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/netty/netty-resolver/4.1.82.Final/netty-resolver-4.1.82.Final.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-compress/1.21/commons-compress-1.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/rnorth/duct-tape/duct-tape/1.0.8/duct-tape-1.0.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/github/docker-java/docker-java-api/3.2.13/docker-java-api-3.2.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/github/docker-java/docker-java-transport-zerodep/3.2.13/docker-java-transport-zerodep-3.2.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/testcontainers/jdbc/1.17.3/jdbc-1.17.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/circe/circe-parser_3/0.14.3/circe-parser_3-0.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/circe/circe-generic_3/0.14.3/circe-generic_3-0.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/circe/circe-numbers_3/0.14.3/circe-numbers_3-0.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/typelevel/cats-core_3/2.8.0/cats-core_3-2.8.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scalameta/scalafmt-sysops_2.13/3.7.14/scalafmt-sysops_2.13-3.7.14.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scalameta/scalafmt-config_2.13/3.7.14/scalafmt-config_2.13-3.7.14.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scalameta/scalameta_2.13/4.8.10/scalameta_2.13-4.8.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.11/scala-reflect-2.13.11.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/jetbrains/annotations/17.0.0/annotations-17.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/github/docker-java/docker-java-transport/3.2.13/docker-java-transport-3.2.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/net/java/dev/jna/jna/5.13.0/jna-5.13.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/testcontainers/database-commons/1.17.3/database-commons-1.17.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/circe/circe-jawn_3/0.14.3/circe-jawn_3-0.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/typelevel/cats-kernel_3/2.8.0/cats-kernel_3-2.8.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/geirsson/metaconfig-core_2.13/0.11.1/metaconfig-core_2.13-0.11.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/geirsson/metaconfig-typesafe-config_2.13/0.11.1/metaconfig-typesafe-config_2.13-0.11.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scalameta/parsers_2.13/4.8.10/parsers_2.13-4.8.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scalap/2.13.11/scalap-2.13.11.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/typelevel/jawn-parser_3/1.4.0/jawn-parser_3-1.4.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/geirsson/metaconfig-pprint_2.13/0.11.1/metaconfig-pprint_2.13-0.11.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/typelevel/paiges-core_2.13/0.4.2/paiges-core_2.13-0.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scalameta/trees_2.13/4.8.10/trees_2.13-4.8.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-compiler/2.13.11/scala-compiler-2.13.11.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scalameta/common_2.13/4.8.10/common_2.13-4.8.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/github/java-diff-utils/java-diff-utils/4.12/java-diff-utils-4.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/jline/jline/3.22.0/jline-3.22.0.jar [exists ]
Options:
-unchecked -deprecation -feature -Xsemanticdb -sourceroot <WORKSPACE>


action parameters:
offset: 1732
uri: jar:file://<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/client3/core_3/3.8.8/core_3-3.8.8-sources.jar!/sttp/client3/SttpApi.scala
text:
```scala
package sttp.client3

import sttp.capabilities.{Effect, Streams, WebSockets}
import sttp.client3.internal.{SttpFile, _}
import sttp.model._
import sttp.ws.{WebSocket, WebSocketFrame}

import java.io.InputStream
import java.nio.ByteBuffer
import scala.collection.immutable.Seq
import scala.concurrent.duration._

trait SttpApi extends SttpExtensions with UriInterpolator {
  val DefaultReadTimeout: Duration = 1.minute

  /** An empty request with no headers.
    *
    * Reads the response body as an `Either[String, String]`, where `Left` is used if the status code is non-2xx, and
    * `Right` otherwise.
    */
  val emptyRequest: RequestT[Empty, Either[String, String], Any] =
    RequestT[Empty, Either[String, String], Any](
      None,
      None,
      NoBody,
      Vector(),
      asString,
      RequestOptions(
        followRedirects = true,
        DefaultReadTimeout,
        FollowRedirectsBackend.MaxRedirects,
        redirectToGet = false
      ),
      Map()
    )

  /** A starting request, with the following modification comparing to `emptyRequest`: `Accept-Encoding` is set to
    * `gzip, deflate` (compression/decompression is handled automatically by the library).
    *
    * Reads the response body as an `Either[String, String]`, where `Left` is used if the status code is non-2xx, and
    * `Right` otherwise.
    */
  val basicRequest: RequestT[Empty, Either[String, String], Any] =
    emptyRequest.acceptEncoding("gzip, deflate")

  /** A starting request which always reads the response body as a string, regardless of the status code.
    */
  val quickRequest: RequestT[Empty, String, Any] = basicRequest.response(asStringAlways)

  // response specifications

  def ignore: ResponseAs[Unit, An@@y] = IgnoreResponse

  /** Use the `utf-8` charset by default, unless specified otherwise in the response headers.
    */
  def asString: ResponseAs[Either[String, String], Any] = asString(Utf8)

  /** Use the `utf-8` charset by default, unless specified otherwise in the response headers.
    */
  def asStringAlways: ResponseAs[String, Any] = asStringAlways(Utf8)

  /** Use the given charset by default, unless specified otherwise in the response headers.
    */
  def asString(charset: String): ResponseAs[Either[String, String], Any] =
    asStringAlways(charset)
      .mapWithMetadata { (s, m) =>
        if (m.isSuccess) Right(s) else Left(s)
      }
      .showAs("either(as string, as string)")

  def asStringAlways(charset: String): ResponseAs[String, Any] =
    asByteArrayAlways
      .mapWithMetadata { (bytes, metadata) =>
        val charset2 = metadata.contentType.flatMap(charsetFromContentType).getOrElse(charset)
        val charset3 = sanitizeCharset(charset2)
        new String(bytes, charset3)
      }
      .showAs("as string")

  def asByteArray: ResponseAs[Either[String, Array[Byte]], Any] = asEither(asStringAlways, asByteArrayAlways)

  def asByteArrayAlways: ResponseAs[Array[Byte], Any] = ResponseAsByteArray

  /** Use the `utf-8` charset by default, unless specified otherwise in the response headers.
    */
  def asParams: ResponseAs[Either[String, Seq[(String, String)]], Any] = asParams(Utf8)

  /** Use the `utf-8` charset by default, unless specified otherwise in the response headers.
    */
  def asParamsAlways: ResponseAs[Seq[(String, String)], Any] = asParamsAlways(Utf8)

  /** Use the given charset by default, unless specified otherwise in the response headers.
    */
  def asParams(charset: String): ResponseAs[Either[String, Seq[(String, String)]], Any] = {
    asEither(asStringAlways, asParamsAlways(charset)).showAs("either(as string, as params)")
  }

  /** Use the given charset by default, unless specified otherwise in the response headers.
    */
  def asParamsAlways(charset: String): ResponseAs[Seq[(String, String)], Any] = {
    val charset2 = sanitizeCharset(charset)
    asStringAlways(charset2).map(ResponseAs.parseParams(_, charset2)).showAs("as params")
  }

  def asStream[F[_], T, S](s: Streams[S])(f: s.BinaryStream => F[T]): ResponseAs[Either[String, T], Effect[F] with S] =
    asEither(asStringAlways, asStreamAlways(s)(f))

  def asStreamWithMetadata[F[_], T, S](s: Streams[S])(
      f: (s.BinaryStream, ResponseMetadata) => F[T]
  ): ResponseAs[Either[String, T], Effect[F] with S] =
    asEither(asStringAlways, asStreamAlwaysWithMetadata(s)(f))

  def asStreamAlways[F[_], T, S](s: Streams[S])(f: s.BinaryStream => F[T]): ResponseAs[T, Effect[F] with S] =
    asStreamAlwaysWithMetadata(s)((s, _) => f(s))

  def asStreamAlwaysWithMetadata[F[_], T, S](s: Streams[S])(
      f: (s.BinaryStream, ResponseMetadata) => F[T]
  ): ResponseAs[T, Effect[F] with S] = ResponseAsStream(s)(f)

  def asStreamUnsafe[S](s: Streams[S]): ResponseAs[Either[String, s.BinaryStream], S] =
    asEither(asStringAlways, asStreamAlwaysUnsafe(s))

  def asStreamAlwaysUnsafe[S](s: Streams[S]): ResponseAs[s.BinaryStream, S] = ResponseAsStreamUnsafe(s)

  private[client3] def asSttpFile(file: SttpFile): ResponseAs[SttpFile, Any] =
    ResponseAsFile(file)

  def asWebSocket[F[_], T](f: WebSocket[F] => F[T]): ResponseAs[Either[String, T], Effect[F] with WebSockets] =
    asWebSocketEither(asStringAlways, asWebSocketAlways(f))

  def asWebSocketWithMetadata[F[_], T](
      f: (WebSocket[F], ResponseMetadata) => F[T]
  ): ResponseAs[Either[String, T], Effect[F] with WebSockets] =
    asWebSocketEither(asStringAlways, asWebSocketAlwaysWithMetadata(f))

  def asWebSocketAlways[F[_], T](f: WebSocket[F] => F[T]): ResponseAs[T, Effect[F] with WebSockets] =
    asWebSocketAlwaysWithMetadata((w, _) => f(w))

  def asWebSocketAlwaysWithMetadata[F[_], T](
      f: (WebSocket[F], ResponseMetadata) => F[T]
  ): ResponseAs[T, Effect[F] with WebSockets] =
    ResponseAsWebSocket(f)

  def asWebSocketUnsafe[F[_]]: ResponseAs[Either[String, WebSocket[F]], Effect[F] with WebSockets] =
    asWebSocketEither(asStringAlways, asWebSocketAlwaysUnsafe)

  def asWebSocketAlwaysUnsafe[F[_]]: ResponseAs[WebSocket[F], Effect[F] with WebSockets] = ResponseAsWebSocketUnsafe()

  def asWebSocketStream[S](
      s: Streams[S]
  )(p: s.Pipe[WebSocketFrame.Data[_], WebSocketFrame]): ResponseAs[Either[String, Unit], S with WebSockets] =
    asWebSocketEither(asStringAlways, asWebSocketStreamAlways(s)(p))

  def asWebSocketStreamAlways[S](s: Streams[S])(
      p: s.Pipe[WebSocketFrame.Data[_], WebSocketFrame]
  ): ResponseAs[Unit, S with WebSockets] = ResponseAsWebSocketStream(s, p)

  def fromMetadata[T, R](default: ResponseAs[T, R], conditions: ConditionalResponseAs[T, R]*): ResponseAs[T, R] =
    ResponseAsFromMetadata(conditions.toList, default)

  /** Uses the `onSuccess` response specification for successful responses (2xx), and the `onError` specification
    * otherwise.
    */
  def asEither[A, B, R](onError: ResponseAs[A, R], onSuccess: ResponseAs[B, R]): ResponseAs[Either[A, B], R] =
    fromMetadata(onError.map(Left(_)), ConditionalResponseAs(_.isSuccess, onSuccess.map(Right(_))))
      .showAs(s"either(${onError.show}, ${onSuccess.show})")

  /** Uses the `onSuccess` response specification for 101 responses (switching protocols) on JVM/Native, 200 responses
    * on JS. Otherwise, use the `onError` specification.
    */
  def asWebSocketEither[A, B, R](onError: ResponseAs[A, R], onSuccess: ResponseAs[B, R]): ResponseAs[Either[A, B], R] =
    SttpExtensions.asWebSocketEitherPlatform(onError, onSuccess)

  /** Use both `l` and `r` to read the response body. Neither response specifications may use streaming or web sockets.
    */
  def asBoth[A, B](l: ResponseAs[A, Any], r: ResponseAs[B, Any]): ResponseAs[(A, B), Any] =
    asBothOption(l, r)
      .map { case (a, bo) =>
        // since l has no requirements, we know that the body will be replayable
        (a, bo.get)
      }
      .showAs(s"(${l.show}, ${r.show})")

  /** Use `l` to read the response body. If the raw body value which is used by `l` is replayable (a file or byte
    * array), also use `r` to read the response body. Otherwise ignore `r` (if the raw body is a stream or a web
    * socket).
    */
  def asBothOption[A, B, R](l: ResponseAs[A, R], r: ResponseAs[B, Any]): ResponseAs[(A, Option[B]), R] =
    ResponseAsBoth(l, r)

  // multipart factory methods

  /** Content type will be set to `text/plain` with `utf-8` encoding, can be overridden later using the `contentType`
    * method.
    */
  def multipart(name: String, data: String): Part[BasicRequestBody] =
    Part(name, StringBody(data, Utf8), contentType = Some(MediaType.TextPlainUtf8))

  /** Content type will be set to `text/plain` with given encoding, can be overridden later using the `contentType`
    * method.
    */
  def multipart(name: String, data: String, encoding: String): Part[BasicRequestBody] = {
    Part(name, StringBody(data, encoding), contentType = Some(MediaType.TextPlain.charset(encoding)))
  }

  /** Content type will be set to `application/octet-stream`, can be overridden later using the `contentType` method.
    */
  def multipart(name: String, data: Array[Byte]): Part[BasicRequestBody] =
    Part(name, ByteArrayBody(data), contentType = Some(MediaType.ApplicationOctetStream))

  /** Content type will be set to `application/octet-stream`, can be overridden later using the `contentType` method.
    */
  def multipart(name: String, data: ByteBuffer): Part[BasicRequestBody] =
    Part(name, ByteBufferBody(data), contentType = Some(MediaType.ApplicationOctetStream))

  /** Content type will be set to `application/octet-stream`, can be overridden later using the `contentType` method.
    */
  def multipart(name: String, data: InputStream): Part[BasicRequestBody] =
    Part(name, InputStreamBody(data), contentType = Some(MediaType.ApplicationOctetStream))

  /** Content type will be set to `application/octet-stream`, can be overridden later using the `contentType` method.
    *
    * File name will be set to the name of the file.
    */
  private[client3] def multipartSttpFile(name: String, file: SttpFile): Part[BasicRequestBody] =
    Part(name, FileBody(file), fileName = Some(file.name), contentType = Some(MediaType.ApplicationOctetStream))

  /** Encodes the given parameters as form data using `utf-8`.
    *
    * Content type will be set to `application/x-www-form-urlencoded`, can be overridden later using the `contentType`
    * method.
    */
  def multipart(name: String, fs: Map[String, String]): Part[BasicRequestBody] =
    Part(
      name,
      RequestBody.paramsToStringBody(fs.toList, Utf8),
      contentType = Some(MediaType.ApplicationXWwwFormUrlencoded)
    )

  /** Encodes the given parameters as form data.
    *
    * Content type will be set to `application/x-www-form-urlencoded`, can be overridden later using the `contentType`
    * method.
    */
  def multipart(name: String, fs: Map[String, String], encoding: String): Part[BasicRequestBody] =
    Part(
      name,
      RequestBody.paramsToStringBody(fs.toList, encoding),
      contentType = Some(MediaType.ApplicationXWwwFormUrlencoded)
    )

  /** Encodes the given parameters as form data using `utf-8`.
    *
    * Content type will be set to `application/x-www-form-urlencoded`, can be overridden later using the `contentType`
    * method.
    */
  def multipart(name: String, fs: Seq[(String, String)]): Part[BasicRequestBody] =
    Part(name, RequestBody.paramsToStringBody(fs, Utf8), contentType = Some(MediaType.ApplicationXWwwFormUrlencoded))

  /** Encodes the given parameters as form data.
    *
    * Content type will be set to `application/x-www-form-urlencoded`, can be overridden later using the `contentType`
    * method.
    */
  def multipart(name: String, fs: Seq[(String, String)], encoding: String): Part[BasicRequestBody] =
    Part(
      name,
      RequestBody.paramsToStringBody(fs, encoding),
      contentType = Some(MediaType.ApplicationXWwwFormUrlencoded)
    )

  /** Content type will be set to `application/octet-stream`, can be overridden later using the `contentType` method.
    */
  def multipart[B: BodySerializer](name: String, b: B): Part[BasicRequestBody] =
    Part(name, implicitly[BodySerializer[B]].apply(b), contentType = Some(MediaType.ApplicationXWwwFormUrlencoded))

  /** Content type will be set to `application/octet-stream`, can be overridden later using the `contentType` method.
    */
  def multipartStream[S](s: Streams[S])(name: String, b: s.BinaryStream): Part[RequestBody[S]] =
    Part(
      name,
      StreamBody(s)(b),
      contentType = Some(MediaType.ApplicationOctetStream)
    )
}

```



#### Error stacktrace:

```
dotty.tools.dotc.core.Scopes$MutableScope.lookupEntry(Scopes.scala:367)
	dotty.tools.dotc.core.SymbolLoaders$PackageLoader$PackageScope.lookupEntry(SymbolLoaders.scala:227)
	dotty.tools.dotc.core.Scopes$Scope.contains(Scopes.scala:142)
	dotty.tools.dotc.core.SymDenotations$.stillValidInOwner(SymDenotations.scala:2649)
	dotty.tools.dotc.core.SymDenotations$.stillValid(SymDenotations.scala:2639)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2364)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2472)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2539)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2103)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2141)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.nonPrivateMember(Types.scala:668)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2402)
	dotty.tools.dotc.core.Types$NamedType.memberDenot(Types.scala:2389)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2365)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2130)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2129)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2123)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2090)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2113)
```
#### Short summary: 

dotty.tools.dotc.core.RecursionOverflow: Recursion limit exceeded.
Maybe there is an illegal cyclic reference?
If that's not the case, you could also try to increase the stacksize using the -Xss JVM option.
For the unprocessed stack trace, compile with -Yno-decode-stacktraces.
A recurring operation is (inner to outer):

  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  ...

  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi
  find-member client3.SttpApi