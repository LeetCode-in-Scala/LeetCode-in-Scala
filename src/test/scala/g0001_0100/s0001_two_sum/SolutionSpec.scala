package g0001_0100.s0001_two_sum

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TwoSumSpec extends AnyFlatSpec with Matchers {

  it should "twoSum" in {
    Solution.twoSum(Array(2, 7, 11, 15), 9) shouldEqual Array(0, 1)
  }
}
