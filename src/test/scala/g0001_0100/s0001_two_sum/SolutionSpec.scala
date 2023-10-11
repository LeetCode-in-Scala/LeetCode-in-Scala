package g0001_0100.s0001_two_sum

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("twoSum") {
        Solution.twoSum(Array(2, 7, 11, 15), 9) shouldEqual Array(0, 1)
    }

    test("twoSum2") {
        Solution.twoSum(Array(3, 2, 4), 6) shouldEqual Array(1, 2)
    }

    test("twoSum3") {
        Solution.twoSum(Array(3, 3), 6) shouldEqual Array(0, 1)
    }

    test("twoSum4") {
        Solution.twoSum(Array(3, 3), 7) shouldEqual Array(-1, -1)
    }
}
