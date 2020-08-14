package cu.jaco.fizzbuzz.model

import org.junit.Test

class FizzBuzzNumberTest {

    @Test
    fun getMultiplesOfThree() {

        val multipleOfThree = FizzBuzzNumber(18)
        val nonMultipleOfThree = FizzBuzzNumber(20)

        val multipleOfThreeResult = multipleOfThree.multiplesOfThree
        val nonMultipleOfThreeResult = nonMultipleOfThree.multiplesOfThree

        assert(multipleOfThreeResult)
        assert(!nonMultipleOfThreeResult)

    }

    @Test
    fun getMultiplesOfThreeAndFive() {

        val multipleOfThreeAndFive = FizzBuzzNumber(15)
        val nonMultipleOfThreeAndFive = FizzBuzzNumber(18)

        val multipleOfThreeAndFiveResult = multipleOfThreeAndFive.multiplesOfThreeAndFive
        val nonMultipleOfThreeAndFiveResult = nonMultipleOfThreeAndFive.multiplesOfThreeAndFive

        assert(multipleOfThreeAndFiveResult)
        assert(!nonMultipleOfThreeAndFiveResult)

    }

    @Test
    fun isFizzOrBuzz() {

        val fizzAndBuzzNumber = FizzBuzzNumber(15)
        val fizzNumber = FizzBuzzNumber(18)
        val buzzNumber = FizzBuzzNumber(25)
        val nonFizzOrBuzzNumber = FizzBuzzNumber(32)

        val fizzAndBuzzNumberResult = fizzAndBuzzNumber.isFizzOrBuzz
        val fizzNumberResult = fizzNumber.isFizzOrBuzz
        val buzzNumberResult = buzzNumber.isFizzOrBuzz
        val nonFizzOrBuzzNumberResult = nonFizzOrBuzzNumber.isFizzOrBuzz

        assert(fizzAndBuzzNumberResult)
        assert(fizzNumberResult)
        assert(buzzNumberResult)
        assert(!nonFizzOrBuzzNumberResult)

    }
}