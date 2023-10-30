package g0001_0100.s0032_longest_valid_parentheses

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("longestValidParentheses") {
        assert(Solution.longestValidParentheses("(()") == 2)
    }

    test("longestValidParentheses2") {
        assert(Solution.longestValidParentheses(")()())") == 4)
    }

    test("longestValidParentheses3") {
        assert(Solution.longestValidParentheses("") == 0)
    }
}
