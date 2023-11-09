package g0001_0100.s0007_reverse_integer

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("reverse") {
        Solution.reverse(123) shouldEqual 321
    }

    test("reverse2") {
        Solution.reverse(-123) shouldEqual -321
    }

    test("reverse3") {
        Solution.reverse(120) shouldEqual 21
    }
}
