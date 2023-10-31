package g0001_0100.s0053_maximum_subarray

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("maxSubArray") {
        assert(Solution.maxSubArray(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) == 6)
    }

    test("maxSubArray2") {
        assert(Solution.maxSubArray(Array(1)) == 1)
    }

    test("maxSubArray3") {
        assert(Solution.maxSubArray(Array(5, 4, -1, 7, 8)) == 23)
    }
}
