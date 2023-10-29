package g0001_0100.s0005_longest_palindromic_substring

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("longestPalindrome") {
        assert(Solution.longestPalindrome("babad") === "bab")
    }

    test("longestPalindrome2") {
        assert(Solution.longestPalindrome("cbbd") === "bb")
    }
}
