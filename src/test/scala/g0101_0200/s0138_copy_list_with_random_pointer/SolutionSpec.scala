package g0101_0200.s0138_copy_list_with_random_pointer

import com_github_leetcode.random.Node
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("copyRandomList") {
        val node7 = new Node(7)
        val node13 = new Node(13)
        val node11 = new Node(11)
        val node10 = new Node(10)
        val node1 = new Node(1)
        node7.next = node13
        node13.next = node11
        node11.next = node10
        node10.next = node1
        node1.next = null
        node7.random = null
        node13.random = node7
        node11.random = node1
        node10.random = node11
        node1.random = node7
        val result = Solution.copyRandomList(node7)
        result.toString shouldEqual "[7,null],[13,0],[11,4],[10,2],[1,0]"
    }

    test("copyRandomList2") {
        val node1 = new Node(1)
        val node2 = new Node(2)
        node1.next = node2
        node1.random = node1
        node2.next = null
        node2.random = node2
        val result = Solution.copyRandomList(node1)
        result.toString shouldEqual "[1,0],[2,1]"
    }

    test("copyRandomList3") {
        val node31 = new Node(3)
        val node32 = new Node(3)
        val node33 = new Node(3)
        node31.next = node32
        node31.random = null
        node32.next = node33
        node32.random = node31
        node33.next = null
        node33.random = null
        val result = Solution.copyRandomList(node31)
        result.toString shouldEqual "[3,null],[3,0],[3,null]"
    }
}
