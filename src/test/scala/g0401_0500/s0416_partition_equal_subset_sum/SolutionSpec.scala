package g0401_0500.s0416_partition_equal_subset_sum

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("canPartition") {
        val result = Solution.canPartition(Array(1, 5, 11, 5))
        result should be(true)
    }

    test("canPartition2") {
        val result = Solution.canPartition(Array(1, 2, 3, 5))
        result should be(false)
    }
}
