package g1101_1200.s1143_longest_common_subsequence

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("longestCommonSubsequence") {
        Solution.longestCommonSubsequence("abcde", "ace") shouldEqual 3
    }

    test("longestCommonSubsequence2") {
        Solution.longestCommonSubsequence("abc", "abc") shouldEqual 3
    }

    test("longestCommonSubsequence3") {
        Solution.longestCommonSubsequence("abc", "def") shouldEqual 0
    }
}
