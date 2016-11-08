/**
  * Created by Connor on 10/22/2016.
  */
class MergeSort extends Sort {
  override def imperativeSort(xs: Array[Int]): Unit = {
    val tmpMergeArray = Array.fill(xs.length){0}

    def merge(l: Int, m: Int, r: Int): Unit = {
      for(i <- l to r){
        tmpMergeArray(i) = xs(i)
      }
      var i = l
      var j = m + 1
      var k = l
      while(i <= m && j <= r){
        if(tmpMergeArray(i) <= tmpMergeArray(j)){
          xs(k) = tmpMergeArray(i)
          i += 1
        } else {
          xs(k) = tmpMergeArray(j)
          j += 1
        }
        k += 1
      }
      while(i <= m) {
        xs(k) = tmpMergeArray(i)
        k += 1
        i += 1
      }
    }

    def mSort(l: Int, r: Int): Unit ={
      if(l < r){
        val m = l + ((r - l)/2)
        mSort(l,m)
        mSort((m+1),r)
        merge(l,m,r)
      }
    }

    mSort(0,(xs.length - 1))
  }

  override def functionalSort(xs: Array[Int]): Array[Int] = {
    val n = xs.length / 2
    if (n == 0) {
      xs
    }
    else {
      def merge(xs: Array[Int], ys: Array[Int]) : Array[Int] =
        (xs,ys) match {
        case(Array(), ys) => ys
        case(xs, Array()) => xs
        case(xs, ys) =>
            if(xs.head < ys.head){
              Array(xs.head) ++ merge(xs.tail, ys)
            } else {
              Array(ys.head) ++ merge(xs, ys.tail)
            }
      }
      val (left, right) = xs splitAt(n)
      merge(functionalSort(left), functionalSort(right))
    }
  }
}
