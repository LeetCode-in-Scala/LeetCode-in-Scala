package g0001_0100.s0049_group_anagrams

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("groupAnagrams") {
        val expected = List(
            List("eat", "tea", "ate"),
            List("bat"),
            List("tan", "nat")
        )
        val actual = Solution.groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat"))
        assert(actual.map(_.toSet).toSet == expected.map(_.toSet).toSet)
    }

    test("groupAnagrams2") {
        val expected = List(
            List("")
        )
        val actual = Solution.groupAnagrams(Array(""))
        assert(actual.map(_.toSet).toSet == expected.map(_.toSet).toSet)
    }

    test("groupAnagrams3") {
        val expected = List(
            List("a")
        )
        val actual = Solution.groupAnagrams(Array("a"))
        assert(actual.map(_.toSet).toSet == expected.map(_.toSet).toSet)
    }
}
