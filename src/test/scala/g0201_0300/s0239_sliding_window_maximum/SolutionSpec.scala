package g0201_0300.s0239_sliding_window_maximum

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("maxSlidingWindow") {
        val expected1 = Array(3, 3, 5, 5, 6, 7)
        assert(Solution.maxSlidingWindow(Array(1, 3, -1, -3, 5, 3, 6, 7), 3) === expected1)
    }

    test("maxSlidingWindow2") {
        val expected2 = Array(1)
        assert(Solution.maxSlidingWindow(Array(1), 1) === expected2)
    }
}
