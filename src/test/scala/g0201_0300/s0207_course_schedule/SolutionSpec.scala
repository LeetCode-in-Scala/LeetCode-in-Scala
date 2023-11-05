package g0201_0300.s0207_course_schedule

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("canFinish") {
        assert(Solution.canFinish(2, Array(Array(1, 0))) == true)
    }

    test("canFinish2") {
        assert(Solution.canFinish(2, Array(Array(1, 0), Array(0, 1))) == false)
    }
}
