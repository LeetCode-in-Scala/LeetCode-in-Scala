package g0001_0100.s0034_find_first_and_last_position_of_element_in_sorted_array

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("searchRange") {
        val expected = Array(3, 4)
        val actual = Solution.searchRange(Array(5, 7, 7, 8, 8, 10), 8)
        actual shouldEqual expected
    }

    test("searchRange2") {
        val expected = Array(-1, -1)
        val actual = Solution.searchRange(Array(5, 7, 7, 8, 8, 10), 6)
        actual shouldEqual expected
    }

    test("searchRange3") {
        val expected = Array(-1, -1)
        val actual = Solution.searchRange(Array.empty, 0)
        actual shouldEqual expected
    }
}
