import org.scalatest._

class nthSmallestSpec extends WordSpec with MustMatchers {

  "Hello" must {

    "say hello" in {
      nthSmallest.greet mustEqual "hello"
    }

  }

}
