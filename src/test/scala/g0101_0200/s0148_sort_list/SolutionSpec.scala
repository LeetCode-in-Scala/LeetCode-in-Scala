package g0101_0200.s0148_sort_list

import com_github_leetcode.ListNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("sortList") {
        val listNode1 = new ListNode(4)
        listNode1.next = new ListNode(2)
        listNode1.next.next = new ListNode(1)
        listNode1.next.next.next = new ListNode(3)
        Solution.sortList(listNode1).toString should be("1, 2, 3, 4")
    }

    test("sortList2") {
        val listNode1 = new ListNode(-1)
        listNode1.next = new ListNode(5)
        listNode1.next.next = new ListNode(3)
        listNode1.next.next.next = new ListNode(4)
        listNode1.next.next.next.next = new ListNode(0)
        Solution.sortList(listNode1).toString should be("-1, 0, 3, 4, 5")
    }

    test("sortList3") {
        val listNode1: ListNode = null
        Solution.sortList(listNode1) should be(null)
    }
}
