package g0701_0800.s0739_daily_temperatures

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("dailyTemperatures") {
        Solution.dailyTemperatures(Array(73, 74, 75, 71, 69, 72, 76, 73)) shouldEqual Array(1, 1, 4, 2, 1, 1, 0, 0)
    }

    test("dailyTemperatures2") {
        Solution.dailyTemperatures(Array(30, 40, 50, 60)) shouldEqual Array(1, 1, 1, 0)
    }

    test("dailyTemperatures3") {
        Solution.dailyTemperatures(Array(30, 60, 90)) shouldEqual Array(1, 1, 0)
    }
}
