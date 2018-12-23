package hiroki1117.mathpuzzle

import org.scalatest._
import Matchers._

class PSpec extends FlatSpec {

  "Q01" should "answer 585" in {
    Q01.answer(10) should be (585)
  }

  it should "answer 585 with answer2" in {
    Q01.answer2(10) should be (585)
  }

  "Q02" should "answer 5931" in {
    Q02.answer(1000, 9999) should be (Set(5931))
  }

  "Q03" should "answer 1,4,9,16,25,36,49,64,81,100" in {
    Q03.answer(100) should be (List(1,4,9,16,25,36,49,64,81,100))
  }
}
