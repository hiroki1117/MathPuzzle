package hiroki1117.mathpuzzle

object Q05 {

  /*
  1000円札を10,50,100,500円玉に両替するときの硬貨の組み合わせの総数
  硬貨の枚数は最大で15枚まで
   */

  def answer: Int = {
    val max = 15
    val maxAmount = 1000

    val FiveHundred = 0 to 2
    val Hundred = 0 to 10
    val Fifty = 0 to 20
    val Ten = 0 to 100

    val result = for {
      i <- FiveHundred
      j <- Hundred
      k <- Fifty
      l <- Ten
    } yield {
      if(i+j+k+l>max || (i*500+j*100+k*50+l*10)!=maxAmount)
        None
      else
        Some((i,j,k,l))
    }
    result.filter(_.nonEmpty).length
  }
}
