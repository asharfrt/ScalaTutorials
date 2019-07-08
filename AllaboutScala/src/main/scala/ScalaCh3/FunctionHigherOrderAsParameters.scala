package ScalaCh3

object FunctionHigherOrderAsParameters_Tutorial extends App {

  println("Step 1: define function with curied parameter groups")
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  println("\nStep 2: Defining higher orfer function that takes another function as parameter")
  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }

  println("\nStep 3: HIgher order functionand pass anonuous funciton as paramter ")
  val totalCostOf5Donuts = totalCostWithDiscountFunctionParameter("Glazed Donut")(5){totalCost =>
    val discount = 2
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with anonymous discount function = $totalCostOf5Donuts")



  println("\nStep 4: How to define and pass a function to a higher order function")
  def applyDiscount(totalCost: Double): Double = {
    val discount = 2
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with discount function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")
}