package g0101_0200.s0124_binary_tree_maximum_path_sum

import com_github_leetcode.TreeNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("maxPathSum") {
        val treeNode = TreeNode.create(List(Some(1), Some(2), Some(3)))
        Solution.maxPathSum(treeNode) should be(6)
    }

    test("maxPathSum2") {
        val treeNode = TreeNode.create(List(Some(-10), Some(9), Some(20), Option.empty, Option.empty, Some(15), Some(7)))
        Solution.maxPathSum(treeNode) should be(42)
    }
}
