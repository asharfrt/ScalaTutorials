package ScalaCh3

object FunctionDefinedAsSymbols extends App {


  println("Step 1: Instiating a class")
  val donutCostCalculator = new DonutCostCalculator()

  println("\nStep 2: Calling a function from instantiated clas")
  println(s"Calling minusDiscount() function = ${donutCostCalculator.minusDiscount(10.5)}")

  println("\nStep 4: How to call function whose name is just the symbol -")
  println(s"Calling function - = ${donutCostCalculator.-(10.5)}")

  println("\nStep 5: call a funcion with operator file notation")
  println(s"Calling function - with operator style notation = ${donutCostCalculator - 10.5}")
}

class DonutCostCalculator {

  val totalCost = 100

  def minusDiscount(discount: Double): Double = {
    totalCost - discount
  }

  def -(discount: Double): Double = {
    totalCost - discount
  }

  def +++(taxAmount: Double): Double = {
    totalCost + taxAmount
  }
}