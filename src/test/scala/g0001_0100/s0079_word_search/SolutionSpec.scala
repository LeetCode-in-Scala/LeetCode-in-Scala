package g0001_0100.s0079_word_search

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("exist") {
        val input = Array(
            Array('A', 'B', 'C', 'E'),
            Array('S', 'F', 'C', 'S'),
            Array('A', 'D', 'E', 'E')
        )
        assert(Solution.exist(input, "ABCCED") === true)
    }

    test("exist2") {
        val input = Array(
            Array('A', 'B', 'C', 'E'),
            Array('S', 'F', 'C', 'S'),
            Array('A', 'D', 'E', 'E')
        )
        assert(Solution.exist(input, "SEE") === true)
    }

    test("exist3") {
        val input = Array(
            Array('A', 'B', 'C', 'E'),
            Array('S', 'F', 'C', 'S'),
            Array('A', 'D', 'E', 'E')
        )
        assert(Solution.exist(input, "ABCB") === false)
    }
}
