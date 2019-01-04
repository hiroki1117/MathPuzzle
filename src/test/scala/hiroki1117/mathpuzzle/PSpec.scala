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

  it should "answer ... with answer2" in {
    Q03.answer2(100) should be (List(1,4,9,16,25,36,49,64,81,100))
  }

  "Q04" should "answer 8 when n=20 and m=3" in {
    Q04.answer(20, 3) should be (8)
  }

  it should "answer 22 when n=100 and m=5" in {
    Q04.answer2(100, 5) should be (22)
  }

  "Q05" should "answer 20" in {
    Q05.answer should be (20)
  }

  "Q06" should "answer 34" in {
    Q06.answer(10000) should be (34)
  }

  "Q07" should "answer 19660713,19660905,19770217,19950617,20020505,20130201" in {
    Q07.answer(1964,10,10) should be (List("19660713", "19660905", "19770217", "19950617", "20020505", "20130201"))
  }

  "Q08" should "answer 324932 pattern" in {
    Q08.answer(12) should be (324932)
  }

  "Q10" should "equal (73, 77) with n = 3" in {
    Q10.answer()(1) should be ((73, 77))
  }

  it should "answer 9" in {
    Q10.answer().filter(x => x._1 > x._2).length should be (9)
  }
}
