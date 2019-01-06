package hiroki1117.mathpuzzle

object Q12 {

  /*
  平方根を小数で表したときに0-9までの数字が現れる最短の整数
   */

  //小数の整数部分を含む場合
  def answerIncludeIntegerPart: Int = {
    Stream.from(1).take(10000).find { num =>
      val s = Math.sqrt(num).toString.diff(".").take(10)        //0-9は10種類なので最短ケースは頭から10個
      val t = s.foldLeft(Set(): Set[Char])((acc, h) => acc + h)
      t.size == 10
    }.getOrElse(0)
  }

  //小数の整数部分を含まない場合
  def answerFractionalPartOnly: Int = {
    Stream.from(1).take(10000).find { num =>
      val s = Math.sqrt(num).toString.dropWhile(_!='.').diff(".").take(10)  //整数部分を除く
      val t = s.foldLeft(Set(): Set[Char])((acc, h) => acc + h)
      t.size == 10
    }.getOrElse(0)
  }
}
