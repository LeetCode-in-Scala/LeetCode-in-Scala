package g0301_0400.s0322_coin_change

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("coinChange") {
        val result = Solution.coinChange(Array(1, 2, 5), 11)
        result should be(3)
    }

    test("coinChange2") {
        val result = Solution.coinChange(Array(2), 3)
        result should be(-1)
    }

    test("coinChange3") {
        val result = Solution.coinChange(Array(1), 0)
        result should be(0)
    }
}
