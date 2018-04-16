import org.scalatest._

class CountSpec extends WordSpec with MustMatchers {

  "Count" must {

    "When provided with an Int return an Int" in {
      Count.countOdds(0) mustEqual 0
    }
    "when provided with the number 2 return 1" in {
      Count.countOdds(2) mustEqual 1
    }
    "when provided with the number 7 return 3" in {
      Count.countOdds(7) mustEqual 3
    }
    "when provided with the number 8 return 4 " in {
      Count.countOdds(8) mustEqual 4
    }


  }

}
