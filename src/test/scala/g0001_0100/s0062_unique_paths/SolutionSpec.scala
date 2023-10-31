package g0001_0100.s0062_unique_paths

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("uniquePaths") {
        assert(Solution.uniquePaths(3, 7) === 28)
    }

    test("uniquePaths2") {
        assert(Solution.uniquePaths(3, 2) === 3)
    }
}
