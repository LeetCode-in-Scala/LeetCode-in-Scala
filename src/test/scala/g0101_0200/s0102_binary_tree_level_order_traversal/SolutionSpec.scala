package g0101_0200.s0102_binary_tree_level_order_traversal

import com_github_leetcode.TreeUtils
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("levelOrder") {
        val root = TreeUtils.constructBinaryTree(List(3, 9, 20, null, null, 15, 7))
        Solution.levelOrder(root) shouldBe Array(Array(3), Array(9, 20), Array(15, 7))
    }

    test("levelOrder2") {
        val root = TreeUtils.constructBinaryTree(List(1))
        Solution.levelOrder(root) shouldBe Array(Array(1))
    }

    test("levelOrder3") {
        Solution.levelOrder(null) shouldBe Array.empty
    }
}
