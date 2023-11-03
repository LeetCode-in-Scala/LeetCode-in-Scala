package g0101_0200.s0105_construct_binary_tree_from_preorder_and_inorder_traversal

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("constructBinaryTree") {
        val preorder = Array(3, 9, 20, 15, 7)
        val inorder = Array(9, 3, 15, 20, 7)
        val actual = Solution.buildTree(preorder, inorder)
        actual.toString shouldBe "3,9,20,15,7"
    }

    test("constructBinaryTree2") {
        val preorder = Array(-1)
        val inorder = Array(-1)
        val actual = Solution.buildTree(preorder, inorder)
        actual.toString shouldBe "-1"
    }
}
