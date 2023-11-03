package g0101_0200.s0114_flatten_binary_tree_to_linked_list

import com_github_leetcode.TreeUtils
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("flatten") {
        val root = TreeUtils.constructBinaryTree(List(1, 2, 5, 3, 4, null, 6))
        Solution.flatten(root)
        root.toString shouldBe "1,null,2,null,3,null,4,null,5,null,6"
    }

    test("flatten2") {
        val root = TreeUtils.constructBinaryTree(List(0))
        Solution.flatten(root)
        root.toString shouldBe "0"
    }
}
