package g0401_0500.s0437_path_sum_iii

import com_github_leetcode.TreeNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("pathSum") {
        val tree1 = TreeNode.create(List(Some(10), Some(5), Some(-3), Some(3), Some(2), Option.empty, Some(11), Some(3), Some(-2), Option.empty, Some(1)))
        val result = Solution.pathSum(tree1, 8)
        result should be(3)
    }

    test("pathSum2") {
        val tree2 = TreeNode.create(List(Some(5), Some(4), Some(8), Some(11), Option.empty, Some(13), Some(4), Some(7), Some(2), Option.empty, Option.empty, Some(5), Some(1)))
        val result = Solution.pathSum(tree2, 22)
        result should be(3)
    }
}
