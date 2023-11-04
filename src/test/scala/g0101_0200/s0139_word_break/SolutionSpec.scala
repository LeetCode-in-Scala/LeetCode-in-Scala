package g0101_0200.s0139_word_break

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("wordBreak") {
        val result1 = Solution.wordBreak("leetcode", List("leet", "code"))
        result1 shouldBe true
    }

    test("wordBreak2") {
        val result2 = Solution.wordBreak("applepenapple", List("apple", "pen"))
        result2 shouldBe true
    }

    test("wordBreak3") {
        val result3 = Solution.wordBreak("catsandog", List("cats", "dog", "sand", "and", "cat"))
        result3 shouldBe false
    }
}
