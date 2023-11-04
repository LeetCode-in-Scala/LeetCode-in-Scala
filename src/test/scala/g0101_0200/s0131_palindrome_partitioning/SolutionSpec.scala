package g0101_0200.s0131_palindrome_partitioning

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("partition") {
        Solution.partition("aab") should equal(
            List(List("a", "a", "b"), List("aa", "b"))
        )
    }

    test("partition2") {
        Solution.partition("a") should equal(
            List(List("a"))
        )
    }
}
