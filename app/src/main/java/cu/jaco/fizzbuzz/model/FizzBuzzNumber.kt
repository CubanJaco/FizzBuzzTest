package cu.jaco.fizzbuzz.model

class FizzBuzzNumber(
    private val number: Int
) {

    val multiplesOfThree: Boolean
        get() = number % 3 == 0

    private val multiplesOfFive: Boolean
        get() = number % 5 == 0

    val multiplesOfThreeAndFive: Boolean
        get() = multiplesOfThree && multiplesOfFive

    val isFizzOrBuzz: Boolean
        get() = multiplesOfThree || multiplesOfFive

    override fun toString(): String {
        return number.toString()
    }

}