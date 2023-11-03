package g0101_0200.s0101_symmetric_tree

import com_github_leetcode.TreeUtils
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("isSymmetric") {
        val root = TreeUtils.constructBinaryTree(List(1, 2, 2, 3, 4, 4, 3))
        Solution.isSymmetric(root) shouldBe true
    }

    test("isSymmetric2") {
        val root = TreeUtils.constructBinaryTree(List(1, 2, 2, null, 3, null, 3))
        Solution.isSymmetric(root) shouldBe false
    }
}
