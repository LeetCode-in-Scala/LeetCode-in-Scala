package g0601_0700.s0647_palindromic_substrings

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("countSubstrings") {
        Solution.countSubstrings("abc") shouldEqual 3
    }

    test("countSubstrings2") {
        Solution.countSubstrings("aaa") shouldEqual 6
    }
}
