package g0001_0100.s0042_trapping_rain_water

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("trap") {
        Solution.trap(Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)) shouldEqual 6
    }

    test("trap2") {
        Solution.trap(Array(4, 2, 0, 3, 2, 5)) shouldEqual 9
    }
}
