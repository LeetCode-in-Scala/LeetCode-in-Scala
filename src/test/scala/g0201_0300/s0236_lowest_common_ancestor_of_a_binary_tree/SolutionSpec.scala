package g0201_0300.s0236_lowest_common_ancestor_of_a_binary_tree

import com_github_leetcode.TreeNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("lowestCommonAncestor") {
        val leftNodeLeftNode = new TreeNode(6)
        val leftNodeRightNode = new TreeNode(2, new TreeNode(7), new TreeNode(4))
        val leftNode = new TreeNode(5, leftNodeLeftNode, leftNodeRightNode)
        val rightNode = new TreeNode(1, new TreeNode(0), new TreeNode(8))
        val root = new TreeNode(3, leftNode, rightNode)
        assert(Solution.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(1)).value === 3)
    }

    test("lowestCommonAncestor2") {
        val leftNodeLeftNode = new TreeNode(6)
        val leftNodeRightNode = new TreeNode(2, new TreeNode(7), new TreeNode(4))
        val leftNode = new TreeNode(5, leftNodeLeftNode, leftNodeRightNode)
        val rightNode = new TreeNode(1, new TreeNode(0), new TreeNode(8))
        val root = new TreeNode(3, leftNode, rightNode)
        assert(Solution.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4)).value === 5)
    }

    test("lowestCommonAncestor3") {
        assert(
            Solution.lowestCommonAncestor(
                new TreeNode(2, new TreeNode(1), null),
                new TreeNode(2),
                new TreeNode(1)
            ).value === 2)
    }
}
