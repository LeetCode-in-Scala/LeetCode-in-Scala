package g0201_0300.s0300_longest_increasing_subsequence

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("lengthOfLIS") {
        val result = Solution.lengthOfLIS(Array(10, 9, 2, 5, 3, 7, 101, 18))
        result should be(4)
    }

    test("lengthOfLIS2") {
        val result = Solution.lengthOfLIS(Array(0, 1, 0, 3, 2, 3))
        result should be(4)
    }

    test("lengthOfLIS3") {
        val result = Solution.lengthOfLIS(Array(7, 7, 7, 7, 7, 7, 7))
        result should be(1)
    }
}
