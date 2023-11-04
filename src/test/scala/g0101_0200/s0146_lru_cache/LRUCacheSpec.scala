package g0101_0200.s0146_lru_cache

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class LRUCacheSpec extends AnyFunSuite with Matchers {
    test("lruCache") {
        val lruCache = new LRUCache(2)
        // cache is {1=1}
        lruCache.put(1, 1)
        // cache is {1=1, 2=2}
        lruCache.put(2, 2)
        // return 1
        lruCache.get(1) should be(1)
        // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lruCache.put(3, 3)
        // returns -1 (not found)
        lruCache.get(2) should be(-1)
        // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lruCache.put(4, 4)
        // return -1 (not found)
        lruCache.get(1) should be(-1)
        // return 3
        lruCache.get(3) should be(3)
        // return 4
        lruCache.get(4) should be(4)
    }
}
