package g0101_0200.s0104_maximum_depth_of_binary_tree

import com_github_leetcode.TreeUtils
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("maxDepthBinaryTree") {
        val root = TreeUtils.constructBinaryTree(List(3, 9, 20, null, null, 15, 7))
        Solution.maxDepth(root) shouldBe 3
    }

    test("maxDepthBinaryTree2") {
        val root = TreeUtils.constructBinaryTree(List(1, null, 2))
        Solution.maxDepth(root) shouldBe 2
    }
}
