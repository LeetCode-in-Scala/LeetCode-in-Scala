package g0001_0100.s0076_minimum_window_substring

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("minWindow") {
        assert(Solution.minWindow("ADOBECODEBANC", "ABC") === "BANC")
    }

    test("minWindow2") {
        assert(Solution.minWindow("a", "a") === "a")
    }

    test("minWindow3") {
        assert(Solution.minWindow("a", "aa") === "")
    }
}
