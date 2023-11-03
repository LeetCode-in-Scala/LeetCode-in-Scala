package g0001_0100.s0096_unique_binary_search_trees

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("numTrees") {
        Solution.numTrees(3) shouldBe 5
    }

    test("numTrees2") {
        Solution.numTrees(1) shouldBe 1
    }
}
