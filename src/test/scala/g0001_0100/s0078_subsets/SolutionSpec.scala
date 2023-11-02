package g0001_0100.s0078_subsets

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("subsets") {
        val expected = List(List(), List(1), List(2, 1), List(3, 2, 1), List(3, 1), List(2), List(3, 2), List(3))
        assert(Solution.subsets(Array(1, 2, 3)) === expected)
    }

    test("subsets2") {
        val expected = List(List(), List(0))
        assert(Solution.subsets(Array(0)) === expected)
    }
}
