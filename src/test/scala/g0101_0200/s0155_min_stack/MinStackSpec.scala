package g0101_0200.s0155_min_stack

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MinStackSpec extends AnyFunSuite with Matchers {
    test("minStack") {
        val minStack = new MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        // return -3
        minStack.getMin() should be(-3)
        minStack.pop()
        // return 0
        minStack.top() should be(0)
        // return -2
        minStack.getMin() should be(-2)
    }
}
