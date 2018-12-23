package hiroki1117.mathpuzzle

import scala.collection.mutable.ArrayBuffer

object Q03 {

  /*
  カードを100枚裏返しに置いて、n(2...)番目のカードからn-1枚おきにカードを裏返す
  最終的に裏向きのままのカードの番号を求める
   */

  /*
  @param to カードの枚数（デフォルト100枚）
   */
  def answer(to: Int = 100): List[Int] = {
    val cards = ((1 to to).toList zip List.fill(to)(true)).to[ArrayBuffer]
    for(i <- 2 to to) {
      cards foreach { x =>
        if(x._1%i==0) cards(x._1-1) = (x._1, !x._2)
      }
    }
    cards.toList.filter(_._2).map(_._1)
  }
}
