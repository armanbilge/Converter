organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-616bd6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mongoose" % "0.0-unknown-8de7ef",
  "org.scalablytyped" %%% "node" % "0.0-unknown-b93f15",
  "org.scalablytyped" %%% "std" % "0.0-unknown-5f966a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
