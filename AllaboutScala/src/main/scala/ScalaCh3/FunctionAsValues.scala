package ScalaCh3

import scala.util.Random
object FunctionAsValues extends App {

  println("\nStep 1: Higher ORder function which takes fuction as parameter")
  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }
  println("\nStep 2: Passing def to higher order function")
  def applyDiscount(totalCost: Double): Double = {
    val discount = 2
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with discount def function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")
  println("\nStep 3:Val function to a higher order function")
  val applyDiscountValueFunction = (totalCost: Double) => {

    val discount = 2
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with discount val function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscountValueFunction)}")
}