import sbt._
import de.element34.sbteclipsify._

class PicnicProject(info: ProjectInfo) extends DefaultProject(info) with Eclipsify {
	val jbossRepository = "JBoss Maven Repository" at "http://repository.jboss.org/maven2"
	lazy val hibernate3 = "org.hibernate" % "hibernate-distribution" % "3.5.1-Final"
}