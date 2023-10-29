package g0001_0100.s0011_container_with_most_water

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("maxArea") {
        assert(Solution.maxArea(Array(1, 8, 6, 2, 5, 4, 8, 3, 7)) === 49)
    }

    test("maxArea2") {
        assert(Solution.maxArea(Array(1, 1)) === 1)
    }
}
