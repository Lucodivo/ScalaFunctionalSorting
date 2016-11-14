package sorting

/**
  * @author Connor
  */
abstract class Sort {
  def imperativeSort(xs: Array[Int]): Array[Int]
}

object Sort {
  def sort(xs: Array[Int], f: Array[Int] => Array[Int]): Array[Int] = {
    f(xs)
  }
}
