package g0101_0200.s0200_number_of_islands

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("numIslands") {
        assert(
            Solution.numIslands(
                Array(
                    Array('1', '1', '1', '1', '0'),
                    Array('1', '1', '0', '1', '0'),
                    Array('1', '1', '0', '0', '0'),
                    Array('0', '0', '0', '0', '0')
                )
            ) == 1
        )
    }

    test("numIslands2") {
        assert(
            Solution.numIslands(
                Array(
                    Array('1', '1', '0', '0', '0'),
                    Array('1', '1', '0', '0', '0'),
                    Array('0', '0', '1', '0', '0'),
                    Array('0', '0', '0', '1', '1')
                )
            ) == 3
        )
    }
}
