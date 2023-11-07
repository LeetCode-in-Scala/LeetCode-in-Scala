package g0201_0300.s0221_maximal_square

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("maximalSquare") {
        val input1 = Array(
            Array('1', '0', '1', '0', '0'),
            Array('1', '0', '1', '1', '1'),
            Array('1', '1', '1', '1', '1'),
            Array('1', '0', '0', '1', '0')
        )
        assert(Solution.maximalSquare(input1) === 4)
    }

    test("maximalSquare2") {
        val input2 = Array(Array('0', '1'), Array('1', '0'))
        assert(Solution.maximalSquare(input2) === 1)
    }

    test("maximalSquare3") {
        val input3 = Array(Array('0'))
        assert(Solution.maximalSquare(input3) === 0)
    }
}
