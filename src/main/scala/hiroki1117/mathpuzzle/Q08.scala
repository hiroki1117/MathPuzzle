package hiroki1117.mathpuzzle

object Q08 {

  /*
  上下左右に１ずつ移動できるが、過去にいた場所には行かない
  12回移動する場合に何通りのルートが存在するか
   */

  def answer(num: Int): Int = {
    var acc = List(Route(List(Point(0,0))))
    for(i <- 1 to num) {
      acc = acc.flatMap(_.next)
    }
    acc.length
  }

  case class Point(x:Int,y:Int){
    def move: List[Point] = List(
      this.copy(x = x+1),
      this.copy(x = x-1),
      this.copy(y = y+1),
      this.copy(y = y-1)
    )
  }
  case class Route(route: List[Point]){
    def checkRoute: Boolean = route.length == route.distinct.length
    def next: List[Route] = {
      route.head.move.map(x => Route(x :: route)).filter(_.checkRoute)
    }
  }
}
