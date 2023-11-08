package g0401_0500.s0438_find_all_anagrams_in_a_string

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("findAnagrams") {
        val result = Solution.findAnagrams("cbaebabacd", "abc")
        result should be(List(0, 6))
    }

    test("findAnagrams2") {
        val result = Solution.findAnagrams("abab", "ab")
        result should be(List(0, 1, 2))
    }
}
