package g0001_0100.s0033_search_in_rotated_sorted_array

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("search") {
        assert(Solution.search(Array(4, 5, 6, 7, 0, 1, 2), 0) == 4)
    }

    test("search2") {
        assert(Solution.search(Array(4, 5, 6, 7, 0, 1, 2), 3) == -1)
    }

    test("search3") {
        assert(Solution.search(Array(1), 0) == -1)
    }
}
