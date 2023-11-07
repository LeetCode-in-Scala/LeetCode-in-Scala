package g0201_0300.s0283_move_zeroes

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("moveZeroes") {
        val array1 = Array(0, 1, 0, 3, 12)
        Solution.moveZeroes(array1)
        assert(array1 === Array(1, 3, 12, 0, 0))
    }

    test("moveZeroes2") {
        val array2 = Array(0)
        Solution.moveZeroes(array2)
        assert(array2 === Array(0))
    }
}
