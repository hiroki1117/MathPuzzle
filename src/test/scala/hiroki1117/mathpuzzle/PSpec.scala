package hiroki1117.mathpuzzle

import org.scalatest._
import Matchers._

class PSpec extends FlatSpec {

  "Q01" should "answer 585" in {
    Q01.answer(10) should be (585)
  }
}
