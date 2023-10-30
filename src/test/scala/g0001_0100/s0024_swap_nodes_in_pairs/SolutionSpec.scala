package g0001_0100.s0024_swap_nodes_in_pairs

import com_github_leetcode.{LinkedListUtils, ListNode}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("swapPairs") {
        val head = LinkedListUtils.createSinglyLinkedList(Array(1, 2, 3, 4))
        Solution.swapPairs(head).toString shouldEqual "2, 1, 4, 3"
    }

    test("swapPairs2") {
        Solution.swapPairs(new ListNode(1)).toString shouldEqual "1"
    }
}
