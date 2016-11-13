package companion

/**
  * Created by Connor on 11/13/2016.
  */
class SomeClass {
  private val helloWorld = "Hello World"
}

object SomeClass {
  def printHelloWorld() = {
    val sc = new SomeClass()
    println("Accessing a private String value using a companion object")
    println(sc.helloWorld + "\n")
  }
}
