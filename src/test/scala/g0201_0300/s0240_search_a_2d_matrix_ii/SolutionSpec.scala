package g0201_0300.s0240_search_a_2d_matrix_ii

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("searchMatrix") {
        val matrix = Array(
            Array(1, 4, 7, 11, 15),
            Array(2, 5, 8, 12, 19),
            Array(3, 6, 9, 16, 22),
            Array(10, 13, 14, 17, 24),
            Array(18, 21, 23, 26, 30)
        )
        assert(Solution.searchMatrix(matrix, 5) === true)
    }

    test("searchMatrix2") {
        val matrix = Array(
            Array(1, 4, 7, 11, 15),
            Array(2, 5, 8, 12, 19),
            Array(3, 6, 9, 16, 22),
            Array(10, 13, 14, 17, 24),
            Array(18, 21, 23, 26, 30)
        )
        assert(Solution.searchMatrix(matrix, 20) === false)
    }
}
