organization := "org.scalablytyped"
name := "stardust-ui__react-component-ref"
version := "0.38.0-5fd176"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "react" % "16.9.2-3291ce",
  "org.scalablytyped" %%% "std" % "0.0-unknown-ae4050",
  ("com.github.japgolly.scalajs-react" %%% "core" % "1.7.5").cross(CrossVersion.for3Use2_13))
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
