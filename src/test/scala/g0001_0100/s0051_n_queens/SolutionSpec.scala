package g0001_0100.s0051_n_queens

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("solveNQueens") {
        val expected = List(
            List(".Q..", "...Q", "Q...", "..Q."),
            List("..Q.", "Q...", "...Q", ".Q..")
        )
        val actual = Solution.solveNQueens(4)
        assert(actual.map(_.toSet).toSet == expected.map(_.toSet).toSet)
    }

    test("solveNQueens2") {
        val expected = List(List("Q"))
        val actual = Solution.solveNQueens(1)
        assert(actual.map(_.toSet).toSet == expected.map(_.toSet).toSet)
    }
}
