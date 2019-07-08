package ScalaCh3

import scala.util.control.TailCalls.TailRec
import scala.util.control.TailCalls._
object FunctionRecursiveTailCall extends App {


  println("\nStep 1: Tail Recursive Function")
  @annotation.tailrec
  def search(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
    if(donuts.length == index) {
      None
    } else if(donuts(index) == donutName) {
      Some(true)
    } else {
      val nextIndex = index + 1
      search(donutName, donuts, nextIndex)
    }
  }

  println("\nStep 2: Call a tail function ")
  val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
  val found = search("Glazed Donut", arrayDonuts, 0)
  println(s"Find Glazed Donut = $found")



  println("\nStep 3: How to define a tail recursive function using scala.util.control.TailCalls._")
  def tailSearch(donutName: String, donuts: Array[String], index: Int): TailRec[Option[Boolean]] = {
    if(donuts.length == index) {
      done(None)
    } else if(donuts(index) == donutName) {
      done(Some(true))
    } else {
      val nextIndex = index + 1
      tailcall(tailSearch(donutName, donuts, nextIndex))
    }
  }

  println("\nStep 4: How to call tail recursive function using scala.util.control.TailCalls._")
  val tailFound = tailcall(tailSearch("Glazed Donut", arrayDonuts, 0))
  println(s"Find Glazed Donut using TailCall = ${tailFound.result}")

  val tailNotFound = tailcall(tailSearch("Chocolate Donut", arrayDonuts, 0))
  println(s"Find Chocolate Donut using TailCall = ${tailNotFound.result}")
}