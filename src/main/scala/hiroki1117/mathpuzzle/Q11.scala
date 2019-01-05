package hiroki1117.mathpuzzle

object Q11 {
  /*
  フィボナッチ数列で各桁の数字を足した数で割り切れる数を求める
   */

  val fib: Stream[BigInt] = BigInt(1) #:: fib.zip(BigInt(1) #:: fib).map{x=> x._1 + x._2}

  def answer: Stream[BigInt] = fib.filter(x => x%sumDigit(x)==0)

  def sumDigit(n: BigInt): Int = n.toString().foldLeft(0)((acc, x)=> acc + x.asDigit)
}
