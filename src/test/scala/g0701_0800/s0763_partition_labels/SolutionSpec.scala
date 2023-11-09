package g0701_0800.s0763_partition_labels

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFunSuite with Matchers {
    test("partitionLabels") {
        Solution.partitionLabels("ababcbacadefegdehijhklij") shouldEqual List(9, 7, 8)
    }

    test("partitionLabels2") {
        Solution.partitionLabels("eccbbbbdec") shouldEqual List(10)
    }
}
