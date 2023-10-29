package g0001_0100.s0015_3sum

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("threeSum") {
        Solution.threeSum(Array(-1, 0, 1, 2, -1, -4)) shouldEqual List(List(-1, 0, 1), List(-1, -1, 2))
    }

    test("threeSum2") {
        Solution.threeSum(Array()) shouldEqual List()
    }

    test("threeSum3") {
        Solution.threeSum(Array(0)) shouldEqual List[List[Int]]()
    }
}
