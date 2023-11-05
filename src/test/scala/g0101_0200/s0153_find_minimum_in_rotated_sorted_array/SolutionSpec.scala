package g0101_0200.s0153_find_minimum_in_rotated_sorted_array

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("findMin") {
        Solution.findMin(Array(3, 4, 5, 1, 2)) should be(1)
    }

    test("findMin2") {
        Solution.findMin(Array(4, 5, 6, 7, 0, 1, 2)) should be(0)
    }

    test("findMin3") {
        Solution.findMin(Array(11, 13, 15, 17)) should be(11)
    }
}
