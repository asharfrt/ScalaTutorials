package ScalaCh3

object FunctionCompositionCompose {
  println("Step 1: Assume a pre-calculated total cost amount")
  val totalCost: Double = 10
  println("\nStep 2: How to define a val function to apply discount to total cost")
  val applyDiscountValFunction = (amount: Double) => {
    println("Apply discount function")
    val discount = 2
    amount - discount
  }

  println("\nStep 3: How to call a val function")
  println(s"Total cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")

  println("\nStep 4: How to define a val function to apply tax to total cost")
  val applyTaxValFunction = (amount: Double) => {
    println("Apply tax function")
    val tax = 1
    amount + tax
  }

  println("\nStep 5: How to call compose on a val function")
  println(s"Total cost of 5 donuts = ${ (applyDiscountValFunction compose applyTaxValFunction)(totalCost) }")

}
