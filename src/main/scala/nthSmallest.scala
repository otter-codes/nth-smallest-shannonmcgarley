object nthSmallest extends App {

  def apply(n : Int, numlist : List[Int]) : Int ={
   numlist.distinct.sorted.reverse(n-1)
  }

}
