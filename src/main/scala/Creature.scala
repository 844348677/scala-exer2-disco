/**
  * Created by liuh on 2016/3/1.
  */
class Creature {
  val range : Int = 10
  val env : Array[Int] = new Array[Int](range)
}

class Ant extends Creature{
  override  val range = 2
}

class NewAnt extends{
  override  val range = 2
} with Creature

object test{
  def main(args: Array[String]) {
    val testAnt = new Ant
    println(testAnt.env.length)

    val testNewAnt = new NewAnt
    println(testNewAnt.env.length)
  }


}
