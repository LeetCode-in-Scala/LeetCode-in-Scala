package g0001_0100.s0025_reverse_nodes_in_k_group

import com_github_leetcode.LinkedListUtils
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("reverseKGroup") {
        val head = LinkedListUtils.createSinglyLinkedList(Array(1, 2, 3, 4, 5))
        Solution.reverseKGroup(head, 2).toString shouldEqual "2, 1, 4, 3, 5"
    }

    test("reverseKGroup2") {
        val head = LinkedListUtils.createSinglyLinkedList(Array(1, 2, 3, 4, 5))
        Solution.reverseKGroup(head, 3).toString shouldEqual "3, 2, 1, 4, 5"
    }
}
