package cu.jaco.fizzbuzz.model

class FizzBuzzNumber(
    private val number: Int
) {

    val multiplesOfThree: Boolean
        get() = true

    private val multiplesOfFive: Boolean
        get() = true

    val multiplesOfThreeAndFive: Boolean
        get() = true

    val isFizzOrBuzz: Boolean
        get() = true

    override fun toString(): String {
        return number.toString()
    }

}