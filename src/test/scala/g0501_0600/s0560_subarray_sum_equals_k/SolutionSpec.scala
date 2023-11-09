package g0501_0600.s0560_subarray_sum_equals_k

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("subarraySum") {
        Solution.subarraySum(Array(1, 1, 1), 2) shouldEqual 2
    }

    test("subarraySum2") {
        Solution.subarraySum(Array(1, 2, 3), 3) shouldEqual 2
    }
}
