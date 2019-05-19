package scalapb.demo

import scalapb.protos.demo.Person

object Demo {
  def main(args: Array[String]): Unit = {
    val person = Person(name="John", age=38)
    println(person.toByteArray.toVector)
  }
}
