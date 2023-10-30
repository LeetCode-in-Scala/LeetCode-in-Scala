package g0001_0100.s0041_first_missing_positive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("firstMissingPositive") {
        val nums1 = Array(1, 2, 0)
        val expected1 = 3
        val result1 = Solution.firstMissingPositive(nums1)
        result1 shouldEqual expected1
    }

    test("firstMissingPositive2") {
        val nums2 = Array(3, 4, -1, 1)
        val expected2 = 2
        val result2 = Solution.firstMissingPositive(nums2)
        result2 shouldEqual expected2
    }

    test("firstMissingPositive3") {
        val nums3 = Array(7, 8, 9, 11, 12)
        val expected3 = 1
        val result3 = Solution.firstMissingPositive(nums3)
        result3 shouldEqual expected3
    }
}
