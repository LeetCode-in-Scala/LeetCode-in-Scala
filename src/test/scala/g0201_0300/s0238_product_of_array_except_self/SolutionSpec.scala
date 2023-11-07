package g0201_0300.s0238_product_of_array_except_self

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("productExceptSelf") {
        val expected1 = Array(24, 12, 8, 6)
        assert(Solution.productExceptSelf(Array(1, 2, 3, 4)) === expected1)
    }

    test("productExceptSelf2") {
        val expected2 = Array(0, 0, 9, 0, 0)
        assert(Solution.productExceptSelf(Array(-1, 1, 0, -3, 3)) === expected2)
    }
}
