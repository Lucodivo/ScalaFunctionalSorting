import javacode.HelloWorld

import companion.SomeClass
import sorting.{MergeSort, QuickSort}
import polymorphism.{Cat, Dog}

/**
  * Main Driver
  * 1. Using Merge & Quick Sorting.Sort by
  * <p>
  * imperative and functional approaches
  * <p>
  * @author Connor
  */
object Main extends Cloneable {
  val SEPARATOR = "=============================="
  val TAB = "\t"
  def main(args:Array[String]): Unit = {
    // otherExamples()

    val unsorted = Array(62,27,97,26,14,13,3,46,79,17,81,36)

    val qs = new QuickSort()
    val quickFunctional = qs.functionalSort(Array.concat(unsorted))
    val quickImperative = qs.imperativeSort(Array.concat(unsorted))

    val ms = new MergeSort()
    val mergeFunctional = ms.functionalSort(Array.concat(unsorted))
    val mergeImperative = ms.imperativeSort(Array.concat(unsorted))

    println("Quick & Merge Sort by Functional & Imperative approaches")
    println(SEPARATOR)

    println("Quick Sort")
    println(SEPARATOR)

    println("Original Array")
    println(unsorted.deep.mkString(TAB))
    println("By Functional Approach")
    println(quickFunctional.deep.mkString(TAB))

    println("Original Array")
    println(unsorted.deep.mkString(TAB))
    println("By Imperative Approach")
    println(quickImperative.deep.mkString(TAB))
    println(SEPARATOR)

    println("Merge Sort")
    println(SEPARATOR)

    println("Original Array")
    println(unsorted.deep.mkString(TAB))
    println("By Functional Approach")
    println(mergeFunctional.deep.mkString(TAB))

    println("Original Array")
    println(unsorted.deep.mkString(TAB))
    println("By Imperative Approach")
    println(mergeImperative.deep.mkString(TAB))
    println(SEPARATOR)
  }

  def otherExamples() : Unit = {
    val dog = new Dog
    val cat = new Cat
    val animals = List(dog, cat)
    for (animal <- animals) {
      println(animal.makeSound)
    }
    println()
    SomeClass.printHelloWorld()
    println()
    val hw = new HelloWorld()
    hw.printHelloWorld()
    println()
  }
}