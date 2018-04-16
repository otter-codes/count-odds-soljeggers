object Count extends App {

  def countOdds (number: Int) = {
    (0 until number).count(number => number % 2 != 0)
  }

}
