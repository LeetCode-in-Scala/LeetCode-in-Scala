package g0301_0400.s0394_decode_string

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("decodeString") {
        val result = Solution.decodeString("3[a]2[bc]")
        result should be("aaabcbc")
    }

    test("decodeString2") {
        val result = Solution.decodeString("3[a2[c]]")
        result should be("accaccacc")
    }

    test("decodeString3") {
        val result = Solution.decodeString("2[abc]3[cd]ef")
        result should be("abcabccdcdcdef")
    }

    test("decodeString4") {
        val result = Solution.decodeString("abc3[cd]xyz")
        result should be("abccdcdcdxyz")
    }
}
