package g0001_0100.s0035_search_insert_position

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionTest extends AnyFunSuite with Matchers {
    test("searchInsert") {
        val expected = 2
        val actual = Solution.searchInsert(Array(1, 3, 5, 6), 5)
        actual shouldEqual expected
    }

    test("searchInsert2") {
        val expected = 1
        val actual = Solution.searchInsert(Array(1, 3, 5, 6), 2)
        actual shouldEqual expected
    }

    test("searchInsert3") {
        val expected = 4
        val actual = Solution.searchInsert(Array(1, 3, 5, 6), 7)
        actual shouldEqual expected
    }
}
