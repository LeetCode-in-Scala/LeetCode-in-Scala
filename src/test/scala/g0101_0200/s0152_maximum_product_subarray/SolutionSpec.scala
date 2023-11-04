package g0101_0200.s0152_maximum_product_subarray

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("maxProduct") {
        Solution.maxProduct(Array(2, 3, -2, 4)) should be(6)
    }

    test("maxProduct2") {
        Solution.maxProduct(Array(-2, 0, -1)) should be(0)
    }
}
