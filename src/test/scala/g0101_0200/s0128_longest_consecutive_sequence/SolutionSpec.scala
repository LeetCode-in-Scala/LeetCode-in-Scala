package g0101_0200.s0128_longest_consecutive_sequence

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("longestConsecutive") {
        Solution.longestConsecutive(Array(100, 4, 200, 1, 3, 2)) should be(4)
    }

    test("longestConsecutive2") {
        Solution.longestConsecutive(Array(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)) should be(9)
    }
}
