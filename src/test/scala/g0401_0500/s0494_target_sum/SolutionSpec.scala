package g0401_0500.s0494_target_sum

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("findTargetSumWays") {
        Solution.findTargetSumWays(Array(1, 1, 1, 1, 1), 3) shouldEqual 5
    }

    test("findTargetSumWays2") {
        Solution.findTargetSumWays(Array(1), 1) shouldEqual 1
    }
}
