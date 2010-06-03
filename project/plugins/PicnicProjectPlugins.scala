import sbt._

class PicnicProjectPlugins(info: ProjectInfo) extends PluginDefinition(info) {
	lazy val eclipse = "de.element34" % "sbt-eclipsify" % "0.5.3"
}