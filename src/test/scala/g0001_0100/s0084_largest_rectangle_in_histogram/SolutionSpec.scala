package g0001_0100.s0084_largest_rectangle_in_histogram

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("largestRectangleArea") {
        assert(Solution.largestRectangleArea(Array(2, 1, 5, 6, 2, 3)) === 10)
    }

    test("largestRectangleArea2") {
        assert(Solution.largestRectangleArea(Array(2, 4)) === 4)
    }
}
