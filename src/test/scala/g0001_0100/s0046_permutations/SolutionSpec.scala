package g0001_0100.s0046_permutations

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("permute") {
        val expected = Array(Array(1, 2, 3), Array(1, 3, 2), Array(2, 1, 3), Array(2, 3, 1), Array(3, 1, 2), Array(3, 2, 1))
        assert(Solution.permute(Array(1, 2, 3)).map(_.toList).toSet == expected.map(_.toList).toSet)
    }

    test("permute2") {
        val expected = Array(Array(0, 1), Array(1, 0))
        assert(Solution.permute(Array(0, 1)).map(_.toList).toSet == expected.map(_.toList).toSet)
    }

    test("permute3") {
        val expected = Array(Array(1))
        assert(Solution.permute(Array(1)).map(_.toList).toSet == expected.map(_.toList).toSet)
    }
}
