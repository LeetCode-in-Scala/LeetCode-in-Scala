package g0201_0300.s0295_find_median_from_data_stream

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MedianFinderSpec extends AnyFunSuite with Matchers {
    test("medianFinder") {
        val medianFinder = new MedianFinder()
        // arr = [1]
        medianFinder.addNum(1)
        // arr = [1, 2]
        medianFinder.addNum(2)
        // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.findMedian() should be(1.5)
        // arr[1, 2, 3]
        medianFinder.addNum(3)
        // return 2.0
        medianFinder.findMedian() should be(2.0)
    }

    test("medianFinder2") {
        val medianFinder = new MedianFinder()
        medianFinder.addNum(1)
        medianFinder.addNum(3)
        medianFinder.addNum(-1)
        medianFinder.findMedian() should be(1.0)
    }
}
