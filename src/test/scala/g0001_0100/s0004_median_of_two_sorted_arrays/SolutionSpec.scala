package g0001_0100.s0004_median_of_two_sorted_arrays

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("findMedianSortedArrays") {
        assert(Solution.findMedianSortedArrays(Array(1, 3), Array(2)) === 2.0)
    }

    test("findMedianSortedArrays2") {
        assert(Solution.findMedianSortedArrays(Array(1, 2), Array(3, 4)) === 2.5)
    }
}
