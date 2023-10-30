package g0001_0100.s0031_next_permutation

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("nextPermutation") {
        var array = Array(1, 2, 3)
        Solution.nextPermutation(array)
        array shouldEqual Array(1, 3, 2)
    }

    test("nextPermutation2") {
        var array = Array(3, 2, 1)
        Solution.nextPermutation(array)
        array shouldEqual Array(1, 2, 3)
    }

    test("nextPermutation3") {
        var array = Array(1, 1, 5)
        Solution.nextPermutation(array)
        array shouldEqual Array(1, 5, 1)
    }
}
