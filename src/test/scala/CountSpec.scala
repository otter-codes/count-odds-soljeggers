import org.scalatest._

class CountSpec extends WordSpec with MustMatchers {

  "Count" must {

    "When provided with an Int return an Int" in {
      Count.countOdds(1) mustEqual 1
    }

  }

}
