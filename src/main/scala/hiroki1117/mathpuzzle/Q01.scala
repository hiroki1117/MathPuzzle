package hiroki1117.mathpuzzle

object Q01 {
  /*
  10,,8,2進数の何でも回文数になる最小の数
  10以上から
   */

  def answer(num: Int = 10): Int = {
    val stream = Stream.from(num)
    stream.find(checkThree).getOrElse(0)
  }

  //偶数は探索しないように最適化
  def answer2(num: Int = 10): Int = {
    val stream = Stream.from(num)
    stream.filter(_%2==1).find(checkThree).getOrElse(0)
  }

  private[Q01] def checkThree(num: Int): Boolean = checkPalindrome2(num) && checkPalindrome8(num) && checkPalindrome10(num)

  private[Q01] def checkPalindrome10(num: Int): Boolean = num == num.toString.reverse.toInt

  private[Q01] def checkPalindrome8(num: Int): Boolean = num.toOctalString == num.toOctalString.reverse

  private[Q01] def checkPalindrome2(num: Int): Boolean = num.toBinaryString == num.toBinaryString.reverse

}
