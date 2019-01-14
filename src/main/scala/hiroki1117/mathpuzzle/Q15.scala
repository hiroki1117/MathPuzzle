package hiroki1117.mathpuzzle

import scala.collection.mutable.ArrayBuffer

object Q15 {

  /*
  a,bがnだけ離れている。1回で最大4まで移動することができるとき
  同じ場所に停まる移動のパターンの数
   */

  def answer(n: Int): Int = {
    val maxStep = 4
    val array = ArrayBuffer.empty[Int]

    array += 1

    val steplist = (for{
      i <- 1 to maxStep
      j <- 1 to maxStep
    } yield (i,j)).map(x=> x._1+x._2)

    for(i <- 1 to n){
      val t = steplist.map(i - _).filter(_ >= 0).map(array(_)).sum
      array += t
    }
    array(n)
  }
}
