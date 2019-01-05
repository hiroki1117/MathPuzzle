package hiroki1117.mathpuzzle

import org.scalatest._
import Matchers._

class BeginnerSpec extends FlatSpec {
  "Q11" should "be the Stream that number can be divided by sum of its each digit" in {
    Q11.answer.take(12).toList should be(
      List(1,2,3,5,8,21,144,2584,14930352,
        BigInt("86267571272"),
        BigInt("498454011879264"),
        BigInt("160500643816367088")
      )
    )
  }
}
