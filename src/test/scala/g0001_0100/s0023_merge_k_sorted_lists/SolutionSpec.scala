package g0001_0100.s0023_merge_k_sorted_lists

import com_github_leetcode.LinkedListUtils
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("mergeKLists") {
        val head1 = LinkedListUtils.createSinglyLinkedList(Array(1, 4, 5))
        val head2 = LinkedListUtils.createSinglyLinkedList(Array(1, 3, 4))
        val head3 = LinkedListUtils.createSinglyLinkedList(Array(2, 6))
        Solution.mergeKLists(Array(head1, head2, head3)).toString shouldEqual "1, 1, 2, 3, 4, 4, 5, 6"
    }

    test("mergeKLists2") {
        val head1 = LinkedListUtils.createSinglyLinkedList(Array(1, 3, 5, 7, 11))
        val head2 = LinkedListUtils.createSinglyLinkedList(Array(2, 8, 12))
        val head3 = LinkedListUtils.createSinglyLinkedList(Array(4, 6, 9, 10))
        Solution.mergeKLists(Array(head1, head2, head3)).toString shouldEqual "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12"
    }
}
