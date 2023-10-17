package g0001_0100.s0002_add_two_numbers

import org.scalatest.matchers.should.Matchers
import com_github_leetcode.LinkedListUtils
import com_github_leetcode.ListNode
import org.scalatest.funsuite.AnyFunSuite

class SolutionSpec extends AnyFunSuite with Matchers {
    test("addTwoNumbers") {
        val listNode1 = LinkedListUtils.constructLinkedList(Array(2, 4, 3))
        val listNode2 = LinkedListUtils.constructLinkedList(Array(5, 6, 4))
        Solution.addTwoNumbers(listNode1, listNode2).toString shouldBe "7, 0, 8"
    }

    test("addTwoNumbers2") {
        Solution
            .addTwoNumbers(new ListNode(0), new ListNode(0))
            .toString shouldBe "0"
    }

    test("addTwoNumbers3") {
        val listNode1 =
            LinkedListUtils.constructLinkedList(Array(9, 9, 9, 9, 9, 9, 9))
        val listNode2 = LinkedListUtils.constructLinkedList(Array(9, 9, 9, 9))
        Solution
            .addTwoNumbers(listNode1, listNode2)
            .toString shouldBe "8, 9, 9, 9, 0, 0, 0, 1"
    }
}
