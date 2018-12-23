package hiroki1117.mathpuzzle


object Q04 {

  /*
  n[cm]の棒をm人で、1[cm]単位に切り分ける。
  1本の棒を一度に切ることができるのは1人だけ。
   */

  type Stick = Int
  type Sticks = List[Stick]
  object Sticks {
    def apply(n: Int): Sticks = { require(n>=0); List(n)}
    def apply(n: Int*): Sticks = n.to[List]
    def checkAtomic(sticks: Sticks): Boolean = sticks.forall(_ == 1)
    def split(sticks: Sticks, m: Int): Sticks = {
      val sortedSticks = sticks.sorted.reverse
      var cnt = 0
      sortedSticks.flatMap{stick =>
        if(cnt==m || stick==1){
          Sticks(stick)
        } else {
          cnt += 1
          Sticks(stick/2, stick/2+stick%2)
        }
      }
    }
  }

  def answer(n: Int, m: Int): Int = {
    var sticks: Sticks = Sticks(n)
    var count = 0

    while(!Sticks.checkAtomic(sticks)){
      count += 1
      sticks = Sticks.split(sticks, m)
    }
    count
  }

  def answer2(n: Int, m: Int): Int = {
    var count = 0
    var current = 1

    while(n > current) {
      current = if(current<m) current * 2 else m + current
      count += 1
    }
    count
  }
}
