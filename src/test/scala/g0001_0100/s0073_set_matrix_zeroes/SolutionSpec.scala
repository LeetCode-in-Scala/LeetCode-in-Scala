package g0001_0100.s0073_set_matrix_zeroes

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("setZeroes") {
        val matrix = Array(Array(1, 1, 1), Array(1, 0, 1), Array(1, 1, 1))
        Solution.setZeroes(matrix)
        val expected = Array(Array(1, 0, 1), Array(0, 0, 0), Array(1, 0, 1))
        assert(matrix === expected)
    }

    test("setZeroes2") {
        val matrix = Array(Array(0, 1, 2, 0), Array(3, 4, 5, 2), Array(1, 3, 1, 5))
        Solution.setZeroes(matrix)
        val expected = Array(Array(0, 0, 0, 0), Array(0, 4, 5, 0), Array(0, 3, 1, 0))
        assert(matrix === expected)
    }
}
