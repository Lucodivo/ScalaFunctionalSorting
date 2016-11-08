/**
  * Created by Connor on 10/22/2016.
  */
object Main {
  def main(args:Array[String]): Unit = {

    val qs = new QuickSort()
    val unsorted1 = Array(62,27,97,26,14,13,3,46,79,17,81,36)
    val sorted1 = qs.functionalSort(unsorted1)

    println("Starting Array sorted with functional quicksort")
    printArray(unsorted1)
    printArray(sorted1)
    println()

    println("Starting Array sorted with imperative quicksort")
    printArray(unsorted1)
    qs.imperativeSort(unsorted1)
    printArray(unsorted1)
    println()

    val ms = new MergeSort()
    val unsorted2 = Array(6,7,9,2,4,1,3,6,7,1,8,6)
    val sorted2 = ms.functionalSort(unsorted2)

    println("Starting Array sorted with functional mergesort" )
    printArray(unsorted2)
    printArray(sorted2)
    println()

    println("Starting Array sorted with imperative mergesort" )
    printArray(unsorted2)
    ms.imperativeSort(unsorted2)
    printArray(unsorted2)
  }

  def printArray(xs: Array[Int]): Unit = {
    for(x <- xs){
      print(x)
      print(" ")
    }
    println()
  }
}