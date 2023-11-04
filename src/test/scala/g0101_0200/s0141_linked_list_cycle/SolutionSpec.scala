package g0101_0200.s0141_linked_list_cycle

import com_github_leetcode.ListNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("hasCycle") {
        val listNode1 = new ListNode(3)
        listNode1.next = new ListNode(2)
        listNode1.next.next = new ListNode(0)
        listNode1.next.next.next = new ListNode(-4)
        listNode1.next.next.next.next = listNode1.next
        val result1 = Solution.hasCycle(listNode1)
        result1 shouldBe true
    }

    test("hasCycle2") {
        val listNode1 = new ListNode(1)
        listNode1.next = new ListNode(2)
        listNode1.next.next = listNode1
        val result2 = Solution.hasCycle(listNode1)
        result2 shouldBe true
    }

    test("hasCycle3") {
        val listNode1 = new ListNode(1)
        val result3 = Solution.hasCycle(listNode1)
        result3 shouldBe false
    }
}
