package g0301_0400.s0338_counting_bits

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("countBits") {
        val result = Solution.countBits(2)
        result should be(Array(0, 1, 1))
    }

    test("countBits2") {
        val result = Solution.countBits(5)
        result should be(Array(0, 1, 1, 2, 1, 2))
    }
}
