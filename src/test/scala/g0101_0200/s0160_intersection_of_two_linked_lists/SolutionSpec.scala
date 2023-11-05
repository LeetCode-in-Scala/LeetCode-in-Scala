package g0101_0200.s0160_intersection_of_two_linked_lists

import com_github_leetcode.ListNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("getIntersectionNode") {
        val intersectionListNode = new ListNode(8, new ListNode(4, new ListNode(5)))
        val nodeA = new ListNode(4, new ListNode(1, intersectionListNode))
        val nodeB = new ListNode(5, new ListNode(6, new ListNode(1, intersectionListNode)))
        Solution.getIntersectionNode(nodeA, nodeB).x shouldEqual 8
    }

    test("getIntersectionNode2") {
        val nodeA = new ListNode(4, new ListNode(1, new ListNode(2)))
        val nodeB = new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(2))))
        Solution.getIntersectionNode(nodeA, nodeB) shouldBe null
    }
}
