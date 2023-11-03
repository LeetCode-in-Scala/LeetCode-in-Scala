package g0101_0200.s0121_best_time_to_buy_and_sell_stock

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("maxProfit") {
        Solution.maxProfit(Array(7, 1, 5, 3, 6, 4)) should be(5)
    }

    test("maxProfit2") {
        Solution.maxProfit(Array(7, 6, 4, 3, 1)) should be(0)
    }
}
