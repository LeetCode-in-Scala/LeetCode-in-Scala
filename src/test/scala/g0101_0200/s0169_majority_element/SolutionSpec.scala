package g0101_0200.s0169_majority_element

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("majorityElement") {
        Solution.majorityElement(Array(3, 2, 3)) shouldEqual 3
    }

    test("majorityElement2") {
        Solution.majorityElement(Array(2, 2, 1, 1, 1, 2, 2)) shouldEqual 2
    }
}
