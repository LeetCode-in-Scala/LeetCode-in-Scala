package g0101_0200.s0198_house_robber

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("rob") {
        assert(Solution.rob(Array(1, 2, 3, 1)) == 4)
    }

    test("rob2") {
        assert(Solution.rob(Array(2, 7, 9, 3, 1)) == 12)
    }
}
