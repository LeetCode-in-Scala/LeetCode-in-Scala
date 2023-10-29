package g0001_0100.s0010_regular_expression_matching

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("isMatch") {
        assert(Solution.isMatch("aa", "a") === false)
    }

    test("isMatch2") {
        assert(Solution.isMatch("aa", "a*") === true)
    }

    test("isMatch3") {
        assert(Solution.isMatch("ab", ".*") === true)
    }

    test("isMatch4") {
        assert(Solution.isMatch("aab", "c*a*b") === true)
    }

    test("isMatch5") {
        assert(Solution.isMatch("mississippi", "mis*is*p*.") === false)
    }
}
