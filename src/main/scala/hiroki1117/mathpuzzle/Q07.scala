package hiroki1117.mathpuzzle

import java.util.Date
import java.util.Calendar
import java.text.SimpleDateFormat

import scala.collection.mutable.ListBuffer

object Q07 {

  /*
  年月を2進数に変換して逆順にし、10進数に戻した時に同じになる年月を求める
   */

  private val sdf = new SimpleDateFormat("yyyyMMdd")

  def answer(year: Int, month: Int, day: Int): List[String] = {
    val cal = Calendar.getInstance()
    cal.set(Calendar.YEAR, year)
    cal.set(Calendar.MONTH, month-1)
    cal.set(Calendar.DAY_OF_MONTH, day)

    val buffer = ListBuffer.empty[String]

    while(sdf.format(cal.getTime())!= "20200624"){
      val before = cal.getTime |> sdf.format
      val after = cal.getTime |> dateToBinary |> (x => x.reverse) |> binaryToNumstring
      if(before==after) buffer += after
      cal.add(Calendar.DAY_OF_MONTH, 1)
    }
    buffer.toList
  }

  def dateToBinary(date: Date): String = {
    val targetMonth = sdf.format(date)
    targetMonth.toInt.toBinaryString
  }

  def binaryToNumstring(bin: String): String = {
    Integer.parseInt(bin, 2).toString
  }

  implicit class Id[A](value: A) {
    def |>[B](f:A=>B):B = f(value)
  }
}
