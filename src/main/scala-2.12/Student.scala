/**
  * Created by amarendra on 13/1/17.
  */
object Student {

  def main(args: Array[String]): Unit = {

    val dayOfWeek = "Sunday"
    println(dayOfWeek)

    val typeOfDay = dayOfWeek match {
      case "Monday" => "Manic Monday"
      case "Sunday" => "Sleepy Sunday"
    }

    println(typeOfDay)
  }

}
