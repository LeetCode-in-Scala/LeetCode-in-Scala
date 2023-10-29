package g0001_0100.s0020_valid_parentheses

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("isValid") {
        assert(Solution.isValid("()") === true)
    }

    test("isValid2") {
        assert(Solution.isValid("()[]{}") === true)
    }

    test("isValid3") {
        assert(Solution.isValid("(]") === false)
    }

    test("isValid4") {
        assert(Solution.isValid("([)]") === false)
    }

    test("isValid5") {
        assert(Solution.isValid("{[]}") === true)
    }
}
