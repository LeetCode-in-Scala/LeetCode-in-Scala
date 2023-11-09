package g0001_0100.s0009_palindrome_number

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("isPalindrome") {
        Solution.isPalindrome(121) shouldBe true
    }

    test("isPalindrome2") {
        Solution.isPalindrome(-121) shouldBe false
    }

    test("isPalindrome3") {
        Solution.isPalindrome(10) shouldBe false
    }
}
