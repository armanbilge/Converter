organization := "org.scalablytyped"
name := "react-select"
version := "0.0-unknown-5478a4"
scalaVersion := "2.13.5"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "me.shadaj" %%% "slinky-web" % "0.6.7",
  "org.scalablytyped" %%% "react" % "16.9.2-f06e44",
  "org.scalablytyped" %%% "std" % "0.0-unknown-48e157")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
