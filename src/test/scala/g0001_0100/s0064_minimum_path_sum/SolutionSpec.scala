package g0001_0100.s0064_minimum_path_sum

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("minPathSum") {
        val grid = Array(Array(1, 3, 1), Array(1, 5, 1), Array(4, 2, 1))
        Solution.minPathSum(grid) shouldEqual 7
    }

    test("minPathSum2") {
        val grid = Array(Array(1, 2, 3), Array(4, 5, 6))
        Solution.minPathSum(grid) shouldEqual 12
    }
}
