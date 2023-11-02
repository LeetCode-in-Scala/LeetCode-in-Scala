package g0001_0100.s0072_edit_distance

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("minDistance") {
        assert(Solution.minDistance("horse", "ros") == 3)
    }

    test("minDistance2") {
        assert(Solution.minDistance("intention", "execution") == 5)
    }
}
