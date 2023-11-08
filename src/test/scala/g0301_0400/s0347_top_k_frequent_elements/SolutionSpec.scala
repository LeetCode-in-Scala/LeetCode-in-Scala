package g0301_0400.s0347_top_k_frequent_elements

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("topKFrequent") {
        val result = Solution.topKFrequent(Array(1, 1, 1, 2, 2, 3), 2)
        result should be(Array(1, 2))
    }

    test("topKFrequent2") {
        val result = Solution.topKFrequent(Array(1), 1)
        result should be(Array(1))
    }
}
