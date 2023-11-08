package g0201_0300.s0287_find_the_duplicate_number

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("findDuplicate") {
        Solution.findDuplicate(Array(1, 3, 4, 2, 2)) should be(2)
    }

    test("findDuplicate2") {
        Solution.findDuplicate(Array(3, 1, 3, 4, 2)) should be(3)
    }

    test("findDuplicate3") {
        Solution.findDuplicate(Array(1, 1)) should be(1)
    }

    test("findDuplicate4") {
        Solution.findDuplicate(Array(1, 1, 2)) should be(1)
    }
}
