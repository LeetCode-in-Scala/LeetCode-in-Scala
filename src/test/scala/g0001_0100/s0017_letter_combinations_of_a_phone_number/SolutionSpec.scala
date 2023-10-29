package g0001_0100.s0017_letter_combinations_of_a_phone_number

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("letterCombinations") {
        assert(
            Solution.letterCombinations("23") ===
                List("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
        )
    }

    test("letterCombinations2") {
        assert(Solution.letterCombinations("") === List())
    }

    test("letterCombinations3") {
        assert(Solution.letterCombinations("2") === List("a", "b", "c"))
    }

    test("letterCombinations4") {
        assert(Solution.letterCombinations("4") === List("g", "h", "i"))
    }

    test("letterCombinations5") {
        assert(Solution.letterCombinations("5") === List("j", "k", "l"))
    }

    test("letterCombinations6") {
        assert(Solution.letterCombinations("6") === List("m", "n", "o"))
    }

    test("letterCombinations7") {
        assert(Solution.letterCombinations("7") === List("p", "q", "r", "s"))
    }

    test("letterCombinations8") {
        assert(Solution.letterCombinations("8") === List("t", "u", "v"))
    }

    test("letterCombinations9") {
        assert(Solution.letterCombinations("9") === List("w", "x", "y", "z"))
    }
}
