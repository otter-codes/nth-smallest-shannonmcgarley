import org.scalatest._

class nthSmallestSpec extends WordSpec with MustMatchers {

  "nthSmallest" must {

    "return 1 when given List(1) and n = 0" in {
      nthSmallest.apply(1,List(1)) mustEqual 1
    }
    "return 2 when given List(2) and n = 0" in{
      nthSmallest.apply(1,List(2)) mustEqual 2
    }
    "return 3 when given List(4,3) and n = 1" in{
      nthSmallest.apply(2,List(4,3)) mustEqual 3
    }
    "return 4 when given List(5,4,3,2) and n = 2"in{
      nthSmallest.apply(2,List(5,4,3,2)) mustEqual 4
    }
    "return 4 when given List(5,5,4) and n = 2" in{
      nthSmallest.apply(2,List(5,5,4)) mustEqual 4
    }
    "return 5 when givn List(6,6,5) and n = 2" in {
      nthSmallest.apply(2, List(6,6,5)) mustEqual 5
    }
    "return 4 when given List(4,5) and n = 2" in{
      nthSmallest.apply(2,List(4,5)) mustEqual 4
    }


  }

}
