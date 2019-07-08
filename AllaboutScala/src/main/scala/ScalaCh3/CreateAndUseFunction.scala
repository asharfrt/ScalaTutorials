package ScalaCh3

object CreateAndUseFunction extends App {

  println("Step 1: How to define and use a function which has a return type")
  def favDonut(): String = {
    "Donut 1 "
  }
  val myFavDonut = favDonut()
  println(s"My favorite donut is $myFavDonut")

  println("\nStep 2: How to define and use a function with no parenthesis")
  def leastFavDonut = "Plain Donut"
  println(s"My least favorite donut is $leastFavDonut")

  println("\nStep 3: How to define and use a function with no return type")
  def printDonutSalesReport(): Unit = {
    println("Printing Sales Report of Donut")
  }
  printDonutSalesReport()


}