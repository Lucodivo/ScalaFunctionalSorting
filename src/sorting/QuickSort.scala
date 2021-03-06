package sorting

/**
  * @author Connor
  */
class QuickSort extends Sort {

  override def imperativeSort(xs: Array[Int]): Array[Int] = {
    def swap(i: Int, j: Int): Unit = {
      val t = xs(i)
      xs(i) = xs(j)
      xs(j) = t
    }

    def partition(l: Int, r: Int): Int = {
      val pivot = xs((l + r) / 2)
      var i = l
      var j = r
      while (i <= j) {
        while (xs(i) < pivot) {
          i += 1
        }
        while (xs(j) > pivot) {
          j -= 1
        }
        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      i
    }

    def qSort(left: Int, right: Int): Unit = {
      val index = partition(left, right)
      if (left < (index - 1)) {
        qSort(left, index - 1)
      }
      if (index < right) {
        qSort(index, right)
      }
    }
    qSort(0,xs.length - 1)

    xs
  }
}

object QuickSort {
  def functionalSort(xs: Array[Int]): Array[Int] = {
    if(xs.length <= 1) {
      xs
    } else {
      Array.concat(functionalSort(xs filter (xs.head >)), xs filter (xs.head ==), functionalSort(xs filter (xs.head <)))
    }
  }
}
