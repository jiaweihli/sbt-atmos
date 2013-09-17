// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.0-RC2")

addSbtPlugin("com.typesafe.sbt" % "sbt-atmos-play" % "0.3.0-RC4")
