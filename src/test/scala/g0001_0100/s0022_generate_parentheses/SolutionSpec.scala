package g0001_0100.s0022_generate_parentheses

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("generateParenthesis") {
        assert(
            Solution.generateParenthesis(3) ===
                List("((()))", "(()())", "(())()", "()(())", "()()()")
        )
    }

    test("generateParenthesis2") {
        assert(Solution.generateParenthesis(1) === List("()"))
    }
}
