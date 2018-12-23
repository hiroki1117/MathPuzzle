package hiroki1117.mathpuzzle

object Q06 {

  /*
  コラッツ予想
  最初のみ偶数だったら、*3+1する
  最初の値が出てくるパターンは何パターンあるか
   */

  def answer(to: Int): Int = {
    ((2 to to by 2) filter { x =>
      collatzProbremKai(x).tail.contains(x)
    }).length
  }

  def collatzProbrem(num: Int, flag: Boolean = true): List[Int] = {
    if(num==1 && !flag){
      num :: Nil
    } else {
      if(num%2==0){
        num :: collatzProbrem(num/2, false)
      } else {
        num :: collatzProbrem(num*3+1, false)
      }
    }
  }

  def collatzProbremKai(num: Int, flag: Boolean = true): List[Int] = {
    if(num%2==0 && flag) {
      num :: collatzProbremKai(num*3+1, false)
    } else {
      if(num==1 && !flag){
        num :: Nil
      } else {
        if(num%2==0){
          num :: collatzProbrem(num/2, false)
        } else {
          num :: collatzProbrem(num*3+1, false)
        }
      }
    }
  }
}
