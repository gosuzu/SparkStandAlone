import org.apache.spark._
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object ExampleApp {
  def main(args: Array[String]) {
    //用意したaccess_log
    val logFile = "log/access_log"
    //AppNameの設定コメントで書いているがsubmitコマンド押下時に読み込まれるAppNameはファイル名
    val conf = new SparkConf().setAppName("Example Application")
    //sparkcontextのインスタンス生成
    val sc = new SparkContext(conf)
    //access_logデータを取得と同時にキャッシュに読み込み
    val logData = sc.textFile(logFile, 2).cache()
    //logDataの中からlinkを取得+count
    val index = logData.filter(line => line.contains("index.html")).count()
    val html1 = logData.filter(line => line.contains("1.html")).count()
    val html2 = logData.filter(line => line.contains("2.html")).count()
    val html3 = logData.filter(line => line.contains("3.html")).count()
    val html4 = logData.filter(line => line.contains("4.html")).count()
    val html5 = logData.filter(line => line.contains("5.html")).count()
    val html6 = logData.filter(line => line.contains("6.html")).count()
    val html7 = logData.filter(line => line.contains("7.html")).count()
    val html8 = logData.filter(line => line.contains("8.html")).count()
    val html9 = logData.filter(line => line.contains("9.html")).count()
    val gif1  = logData.filter(line => line.contains("1.gif")).count()
    val gif2  = logData.filter(line => line.contains("2.gif")).count()
    //表示
    println("Lines with index.html: %s".format(index))
    println("Lines with 1.html: %s".format(html1))
    println("Lines with 2.html: %s".format(html2))
    println("Lines with 3.html: %s".format(html3))
    println("Lines with 4.html: %s".format(html4))
    println("Lines with 5.html: %s".format(html5))
    println("Lines with 6.html: %s".format(html6))
    println("Lines with 7.html: %s".format(html7))
    println("Lines with 8.html: %s".format(html8))
    println("Lines with 9.html: %s".format(html9))
    println("Lines with 1.gif:  %s".format(gif1))
    println("Lines with 2.gif:  %s".format(gif2))
  }
} 

