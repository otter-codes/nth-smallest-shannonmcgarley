def apply(n : Int, numlist : List[Int]) : Int ={
  numlist.distinct.reverse(n-1)
}
List(1,2,3,4).distinct.reverse(1-1)
List(4,3,2,1).distinct.reverse(1-1)
List(4,3,2,1).distinct.sorted