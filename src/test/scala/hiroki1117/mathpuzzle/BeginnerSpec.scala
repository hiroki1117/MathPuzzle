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

  "Q12" should "be 1362 including Integer part" in {
    Q12.answerIncludeIntegerPart should be (1362)
  }

  it should "be 143 only Fractional part" in {
    Q12.answerFractionalPartOnly should be (143)
  }
}
