package g0101_0200.s0136_single_number

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("singleNumber") {
        Solution.singleNumber(Array(2, 2, 1)) should equal(1)
    }

    test("singleNumber2") {
        Solution.singleNumber(Array(4, 1, 2, 1, 2)) should equal(4)
    }

    test("singleNumber3") {
        Solution.singleNumber(Array(1)) should equal(1)
    }
}
