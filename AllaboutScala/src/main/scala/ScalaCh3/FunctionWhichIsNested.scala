package ScalaCh3

object FunctionWhichIsNested extends App {

  println("Step 1: How to define a function")
  def checkDonutAvailability(donutName: String): Boolean = {

    val listDonutsFromStock: List[String] = List("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

    val iDonutInStock = (donutName.nonEmpty && donutName.length > 0) && (listDonutsFromStock contains donutName)

    iDonutInStock
  }

  println("\nStep 2: How to call a function")
  println(s"Calling checkDonutAvailability with Vanilla Donut = ${checkDonutAvailability("Vanilla Donut")}")

  println("\nStep 3: How to define a Nested Function")
  def checkDonutAvailabilityWithNestedFunction(donutName: String): Boolean = {

    val listDonutsFromStock = List[String]("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")


    val validate = (name: String) => {
      name.nonEmpty && name.length > 0
    }

    val isDonutInStock = validate(donutName) && (listDonutsFromStock contains donutName)

    isDonutInStock
  }
  println("\nStep 4: How to call a Nested Function")
  println(s"Calling checkDonutAvailabilityWithNestedFunction with Vanilla Donut = ${checkDonutAvailabilityWithNestedFunction("Vanilla Donut")}")
}