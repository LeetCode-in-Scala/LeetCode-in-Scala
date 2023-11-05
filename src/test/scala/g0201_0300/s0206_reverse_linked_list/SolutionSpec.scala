package g0201_0300.s0206_reverse_linked_list

import com_github_leetcode.ListNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("reverseList") {
        val headActual = new ListNode(1)
        headActual.next = new ListNode(2)
        headActual.next.next = new ListNode(3)
        headActual.next.next.next = new ListNode(4)
        headActual.next.next.next.next = new ListNode(5)
        val reversedHead = Solution.reverseList(headActual)
        assert(reversedHead.toString == "5, 4, 3, 2, 1")
    }

    test("reverseList2") {
        val headActual = new ListNode(1)
        headActual.next = new ListNode(2)
        val reversedHead = Solution.reverseList(headActual)
        assert(reversedHead.toString == "2, 1")
    }

    test("reverseList3") {
        assert(Solution.reverseList(null) == null)
    }
}
