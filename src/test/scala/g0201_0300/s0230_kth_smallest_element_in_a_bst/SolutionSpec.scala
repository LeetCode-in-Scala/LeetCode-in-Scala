package g0201_0300.s0230_kth_smallest_element_in_a_bst

import com_github_leetcode.TreeNode
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("kthSmallest") {
        val root = TreeNode.create(List(Some(3), Some(1), Some(4), Option.empty, Some(2)))
        assert(Solution.kthSmallest(root, 1) === 1)
    }

    test("kthSmallest2") {
        val root = TreeNode.create(List(Some(5), Some(3), Some(6), Some(2), Some(4), Option.empty, Option.empty, Some(1)))
        assert(Solution.kthSmallest(root, 3) === 3)
    }
}
