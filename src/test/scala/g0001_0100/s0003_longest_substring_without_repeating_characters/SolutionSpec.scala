package g0001_0100.s0003_longest_substring_without_repeating_characters

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("lengthOfLongestSubstring") {
        Solution.lengthOfLongestSubstring("abcabcbb") shouldEqual 3
    }

    test("lengthOfLongestSubstring2") {
        Solution.lengthOfLongestSubstring("bbbbb") shouldEqual 1
    }

    test("lengthOfLongestSubstring3") {
        Solution.lengthOfLongestSubstring("pwwkew") shouldEqual 3
    }
}
