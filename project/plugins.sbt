addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.2")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.2")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.0")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.6.4")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.10")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.10.1"
