package g0001_0100.s0055_jump_game

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("canJump") {
        assert(Solution.canJump(Array(2, 3, 1, 1, 4)) == true)
    }

    test("canJump2") {
        assert(Solution.canJump(Array(3, 2, 1, 0, 4)) == false)
    }
}
