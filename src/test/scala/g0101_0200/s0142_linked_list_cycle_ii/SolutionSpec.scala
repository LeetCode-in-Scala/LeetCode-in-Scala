package g0101_0200.s0142_linked_list_cycle_ii

import com_github_leetcode.ListNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("detectCycle") {
        val listNode1 = new ListNode(3)
        listNode1.next = new ListNode(2)
        listNode1.next.next = new ListNode(0)
        listNode1.next.next.next = new ListNode(-4)
        listNode1.next.next.next.next = listNode1.next
        val result1 = Solution.detectCycle(listNode1)
        result1 should equal(listNode1.next)
    }

    test("detectCycle2") {
        val listNode1 = new ListNode(1)
        listNode1.next = new ListNode(2)
        listNode1.next.next = listNode1
        val result2 = Solution.detectCycle(listNode1)
        result2 should equal(listNode1)
    }

    test("detectCycle3") {
        val listNode1 = new ListNode(1)
        val result3 = Solution.detectCycle(listNode1)
        result3 should be(null)
    }
}
