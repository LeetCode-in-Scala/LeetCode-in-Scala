package g0001_0100.s0019_remove_nth_node_from_end_of_list

import com_github_leetcode.{LinkedListUtils, ListNode}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("removeNthFromEnd") {
        val node1 = LinkedListUtils.constructLinkedList(Array(1, 2, 3, 4, 5))
        assert(Solution.removeNthFromEnd(node1, 2).toString === "1, 2, 3, 5")
    }

    test("removeNthFromEnd2") {
        val node1 = new ListNode()
        node1.x = 1
        assert(Solution.removeNthFromEnd(node1, 1) === null)
    }
}
