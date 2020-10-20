name := """play-java-forms-example"""

version := "2.8.x"
// addSbtPlugin("org.jsoup" % "jsoup" % "1.8.3")
lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

libraryDependencies += guice

// disabled until https://github.com/playframework/playframework/issues/9845 is solved
//scalacOptions ++= List("-encoding", "utf8", "-Xfatal-warnings", "-deprecation")
javacOptions ++= Seq(
  "-Xlint:unchecked",
  "-Xlint:deprecation",
  "-Werror"
) 

libraryDependencies += "org.jsoup" % "jsoup" % "1.8.3"
