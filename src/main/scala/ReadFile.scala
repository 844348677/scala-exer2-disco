import java.io.{FileInputStream, File}

import scala.io.Source

/**
  * Created by liuh on 2016/3/1.
  */
class ReadFile {
def subdirs(dir : File): Iterator[File] = {
  val children = dir.listFiles.filter(_.isDirectory)
  children.toIterator ++ children.toIterator.flatMap(subdirs _)
}


}

object ReadFile{
  def main(args: Array[String]) {
    val source = Source.fromFile("myfile.txt","utf-8")
    val lineIterator = source.getLines
    for(line <- lineIterator){
    }
    val lines = source.getLines.toArray
    val contents = source.mkString

    source.close()

    val tokens = source.mkString.split("\\S+")
    val numbers2 = for(w <- tokens) yield w.toDouble
    val numbers = tokens.map(_.toDouble)

    val file = new File("bytes.txt")
    val in = new FileInputStream(file)
    val bytes = new Array[Byte](file.length().toInt)
    in.read(bytes)
    in.close()

  }
}