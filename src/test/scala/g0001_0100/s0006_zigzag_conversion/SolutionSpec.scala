package g0001_0100.s0006_zigzag_conversion

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("convert") {
        Solution.convert("PAYPALISHIRING", 3) shouldEqual "PAHNAPLSIIGYIR"
    }

    test("convert2") {
        Solution.convert("PAYPALISHIRING", 4) shouldEqual "PINALSIGYAHRPI"
    }
}
