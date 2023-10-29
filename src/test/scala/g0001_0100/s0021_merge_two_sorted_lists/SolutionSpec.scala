package g0001_0100.s0021_merge_two_sorted_lists

import com_github_leetcode.{LinkedListUtils, ListNode}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("mergeTwoLists") {
        val l1 = LinkedListUtils.createSinglyLinkedList(Array(1, 2, 4))
        val l2 = LinkedListUtils.createSinglyLinkedList(Array(1, 3, 4))
        assert(Solution.mergeTwoLists(l1, l2).toString === "1, 1, 2, 3, 4, 4")
    }

    test("mergeTwoLists2") {
        assert(Solution.mergeTwoLists(new ListNode(), new ListNode()).toString === "0, 0")
    }
}
