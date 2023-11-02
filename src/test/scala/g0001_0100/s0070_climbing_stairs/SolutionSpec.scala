package g0001_0100.s0070_climbing_stairs

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("climbStairs") {
        Solution.climbStairs(2) shouldEqual 2
    }

    test("climbStairs2") {
        Solution.climbStairs(3) shouldEqual 3
    }
}
