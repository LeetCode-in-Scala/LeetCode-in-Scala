package g0001_0100.s0008_string_to_integer_atoi

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("myAtoi") {
        Solution.myAtoi("42") shouldEqual 42
    }

    test("myAtoi2") {
        Solution.myAtoi("   -42") shouldEqual -42
    }

    test("myAtoi3") {
        Solution.myAtoi("4193 with words") shouldEqual 4193
    }

    test("myAtoi4") {
        Solution.myAtoi("words and 987") shouldEqual 0
    }

    test("myAtoi5") {
        Solution.myAtoi("-91283472332") shouldEqual -2147483648
    }
}
