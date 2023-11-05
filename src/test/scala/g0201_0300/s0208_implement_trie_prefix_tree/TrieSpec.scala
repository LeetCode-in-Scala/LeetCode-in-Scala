package g0201_0300.s0208_implement_trie_prefix_tree

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class TrieSpec extends AnyFunSuite with Matchers {
    test("Trie") {
        val trie = new Trie()
        trie.insert("apple")
        // return True
        trie.search("apple") should be(true)
        // return False
        trie.search("app") should be(false)
        // return True
        trie.startsWith("app") should be(true)
        trie.insert("app")
        // return True
        trie.search("app") should be(true)
    }
}
