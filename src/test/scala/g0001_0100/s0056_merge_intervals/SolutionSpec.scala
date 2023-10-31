package g0001_0100.s0056_merge_intervals

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("merge") {
        assert(
            Solution.merge(Array(Array(1, 3), Array(2, 6), Array(8, 10), Array(15, 18))) ===
                Array(Array(1, 6), Array(8, 10), Array(15, 18))
        )
    }

    test("merge2") {
        assert(
            Solution.merge(Array(Array(1, 4), Array(4, 5))) === Array(Array(1, 5))
        )
    }
}
