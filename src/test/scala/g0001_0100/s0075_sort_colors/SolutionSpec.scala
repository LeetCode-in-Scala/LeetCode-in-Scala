package g0001_0100.s0075_sort_colors

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("sortColors") {
        val array = Array(2, 0, 2, 1, 1, 0)
        Solution.sortColors(array)
        assert(array === Array(0, 0, 1, 1, 2, 2))
    }

    test("sortColors2") {
        val array = Array(2, 0, 1)
        Solution.sortColors(array)
        assert(array === Array(0, 1, 2))
    }
}
