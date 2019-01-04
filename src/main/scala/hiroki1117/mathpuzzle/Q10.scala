package hiroki1117.mathpuzzle

import scala.collection.mutable.ListBuffer

object Q10 {
  val AmericanStyle = List(0,28,9,26,30,11,7,20,32,17,5,22,34,15,3,24,36,13,1,0,27,10,25,29,12,8,19,31,18,6,21,33,16,4,23,35,14,2)
  val EuropeanStyle = List(0,32,15,19,4,21,2,25,17,34,6,27,13,36,11,30,8,23,10,5,24,16,33,1,20,14,31,9,22,18,29,7,28,12,35,3,26)

  def answer(): List[(Int/*American*/, Int/*European*/)] = {
    val AmericanList = for(n <- 2 to 36) yield sumAmerican(n)
    val EuropeanList = for(n <- 2 to 36) yield sumEuropean(n)
    AmericanList zip EuropeanList toList
  }

  def sumAmerican(n: Int): Int = {
    val max = AmericanStyle.length-1
    val sumList = ListBuffer.empty[Int]
    for(i <- 0 to max){
      var acc = 0
      for(j <- Stream.from(i).take(n)) {
        val index = j%max
        acc += AmericanStyle(index)
      }
      sumList += acc
    }
    sumList.max
  }

  def sumEuropean(n: Int): Int = {
    val max = EuropeanStyle.length-1
    val sumList = ListBuffer.empty[Int]
    for(i <- 0 to max) {
      var acc = 0
      for(j <- Stream.from(i).take(n)) {
        val index = j%max
        acc += EuropeanStyle(index)
      }
      sumList += acc
    }
    sumList.max
  }
}
