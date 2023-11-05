package g0101_0200.s0189_rotate_array

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("rotate") {
        val array = Array(1, 2, 3, 4, 5, 6, 7)
        Solution.rotate(array, 3)
        array shouldEqual Array(5, 6, 7, 1, 2, 3, 4)
    }

    test("rotate2") {
        val array = Array(-1, -100, 3, 99)
        Solution.rotate(array, 2)
        array shouldEqual Array(3, 99, -1, -100)
    }
}
