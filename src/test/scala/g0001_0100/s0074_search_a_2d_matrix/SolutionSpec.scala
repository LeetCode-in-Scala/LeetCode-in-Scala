package g0001_0100.s0074_search_a_2d_matrix

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("searchMatrix") {
        val input = Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60))
        assert(Solution.searchMatrix(input, 3) === true)
    }

    test("searchMatrix2") {
        val input = Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60))
        assert(Solution.searchMatrix(input, 13) === false)
    }
}
