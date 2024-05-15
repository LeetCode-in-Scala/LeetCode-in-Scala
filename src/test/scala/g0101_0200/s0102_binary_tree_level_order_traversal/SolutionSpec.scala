package g0101_0200.s0102_binary_tree_level_order_traversal

import com_github_leetcode.TreeUtils
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("levelOrder") {
        val root = TreeUtils.constructBinaryTree(List(3, 9, 20, null, null, 15, 7))
        Solution.levelOrder(root) shouldBe List(List(3), List(9, 20), List(15, 7))
    }

    test("levelOrder2") {
        val root = TreeUtils.constructBinaryTree(List(1))
        Solution.levelOrder(root) shouldBe List(List(1))
    }

    test("levelOrder3") {
        Solution.levelOrder(null) shouldBe List.empty
    }
}
