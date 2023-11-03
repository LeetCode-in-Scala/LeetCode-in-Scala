package g0001_0100.s0098_validate_binary_search_tree

import com_github_leetcode.TreeNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("isValidBST") {
        val treeNode1 = new TreeNode(2)
        treeNode1.left = new TreeNode(1)
        treeNode1.right = new TreeNode(3)
        Solution.isValidBST(treeNode1) shouldBe true
    }

    test("isValidBST2") {
        val treeNode = new TreeNode(5)
        treeNode.left = new TreeNode(1)
        treeNode.right = new TreeNode(4)
        treeNode.right.left = new TreeNode(3)
        treeNode.right.right = new TreeNode(6)
        Solution.isValidBST(treeNode) shouldBe false
    }
}
