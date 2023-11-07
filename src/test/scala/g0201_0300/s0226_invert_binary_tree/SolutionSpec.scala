package g0201_0300.s0226_invert_binary_tree

import com_github_leetcode.TreeUtils
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("invertTree") {
        val root = TreeUtils.constructBinaryTree(List(4, 2, 7, 1, 3, 6, 9))
        assert(Solution.invertTree(root).toString == "4,7,9,6,2,3,1")
    }

    test("invertTree2") {
        val root = TreeUtils.constructBinaryTree(List(2, 1, 3))
        assert(Solution.invertTree(root).toString == "2,3,1")
    }
}
