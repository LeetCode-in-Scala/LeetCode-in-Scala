package g0001_0100.s0045_jump_game_ii

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("jump") {
        assert(Solution.jump(Array(2, 3, 1, 1, 4)) == 2)
    }

    test("jump2") {
        assert(Solution.jump(Array(2, 3, 0, 1, 4)) == 2)
    }
}
