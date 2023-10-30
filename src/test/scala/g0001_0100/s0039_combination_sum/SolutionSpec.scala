package g0001_0100.s0039_combination_sum

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("combinationSum") {
        val expected = Array(List(7), List(3, 2, 2))
        val actual = Solution.combinationSum(Array(2, 3, 6, 7), 7)
        actual shouldEqual expected
    }

    test("combinationSum2") {
        val expected = Array(List(5, 3), List(3, 3, 2), List(2, 2, 2, 2))
        val actual = Solution.combinationSum(Array(2, 3, 5), 8)
        actual shouldEqual expected
    }

    test("combinationSum3") {
        val expected = List()
        val actual = Solution.combinationSum(Array(2), 1)
        actual shouldEqual expected
    }
}
