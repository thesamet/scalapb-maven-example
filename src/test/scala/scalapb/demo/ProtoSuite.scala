package scalapb.demo

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scalapb.protos.demo.Person

@RunWith(classOf[JUnitRunner])
class ProtoSuite extends FunSuite {
  def person = Person(name="John", age=38)

  test("toByteArray is the inverse of parseFrom") {
    assert(Person.parseFrom(person.toByteArray) == person)
  }
}

