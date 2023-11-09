package g0501_0600.s0543_diameter_of_binary_tree

import com_github_leetcode.TreeNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("diameterOfBinaryTree") {
        val tree = TreeNode.create(List(Some(1), Some(2), Some(3), Some(4), Some(5)))
        Solution.diameterOfBinaryTree(tree) shouldEqual 3
    }

    test("diameterOfBinaryTree2") {
        val tree = TreeNode.create(List(Some(1), Some(2)))
        Solution.diameterOfBinaryTree(tree) shouldEqual 1
    }
}
