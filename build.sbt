 
version := "0.1"
 
scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
   "org.xerial" % "sqlite-jdbc" % "3.7.2",
   "org.apache.spark" %% "spark-core" % "1.3.1" % "provided",
   "org.apache.spark" %% "spark-streaming" % "1.3.1"
) 

//重複防止
assemblyMergeStrategy in assembly := {
  case PathList("javax", "servlet", xs @ _*)         => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".properties" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".xml" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".types" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".class" => MergeStrategy.first
  case "application.conf"                            => MergeStrategy.concat
  case "unwanted.txt"                                => MergeStrategy.discard
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}







