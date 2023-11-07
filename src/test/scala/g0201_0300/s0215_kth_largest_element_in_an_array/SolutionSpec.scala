package g0201_0300.s0215_kth_largest_element_in_an_array

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("findKthLargest") {
        assert(Solution.findKthLargest(Array(3, 2, 1, 5, 6, 4), 2) === 5)
    }

    test("findKthLargest2") {
        assert(Solution.findKthLargest(Array(3, 2, 3, 1, 2, 4, 5, 5, 6), 4) === 4)
    }
}
