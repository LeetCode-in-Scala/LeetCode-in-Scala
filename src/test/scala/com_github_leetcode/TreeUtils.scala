package com_github_leetcode

import scala.collection.mutable.Queue

object TreeUtils {
    def constructBinaryTree(treeValues: List[Integer]): TreeNode = {
        val root = new TreeNode(treeValues(0))
        val queue = Queue(root)
        var i = 1

        while (i < treeValues.size) {
            val curr = queue.dequeue()
            if (treeValues(i) != null) {
                curr.left = new TreeNode(treeValues(i))
                queue.enqueue(curr.left)
            }
            i += 1
            if (i < treeValues.size && treeValues(i) != null) {
                curr.right = new TreeNode(treeValues(i))
                queue.enqueue(curr.right)
            }
            i += 1
        }

        root
    }
}
