package g0201_0300.s0234_palindrome_linked_list

import com_github_leetcode.ListNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("isPalindrome") {
        val headActual = new ListNode(1)
        headActual.next = new ListNode(2)
        headActual.next.next = new ListNode(2)
        headActual.next.next.next = new ListNode(1)
        assert(Solution.isPalindrome(headActual) === true)
    }

    test("isPalindrome2") {
        val headActual = new ListNode(1)
        headActual.next = new ListNode(2)
        assert(Solution.isPalindrome(headActual) === false)
    }
}
