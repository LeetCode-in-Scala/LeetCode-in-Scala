package g0001_0100.s0094_binary_tree_inorder_traversal

import com_github_leetcode.TreeNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("inorderTraversal") {
        val treeNode = new TreeNode(1)
        val treeNode2 = new TreeNode(2)
        treeNode.right = treeNode2
        treeNode2.left = new TreeNode(3)
        Solution.inorderTraversal(treeNode).toString() shouldEqual "List(1, 3, 2)"
    }

    test("inorderTraversal2") {
        Solution.inorderTraversal(null).toString() shouldEqual "List()"
    }

    test("inorderTraversal3") {
        Solution.inorderTraversal(new TreeNode(1)).toString() shouldEqual "List(1)"
    }
}
