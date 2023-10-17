package com_github_leetcode

object LinkedListUtils {
    def constructLinkedList(nums: Array[Int]): ListNode = {
        if (nums == null || nums.isEmpty) {
            return null
        }
        val pre = new ListNode(-1)
        var head = new ListNode(nums.head)
        pre.next = head
        for (i <- 1 until nums.length) {
            head.next = new ListNode(nums(i))
            head = head.next
        }
        pre.next
    }

    def createSinglyLinkedList(listValues: List[Int]): ListNode = {
        if (listValues == null || listValues.isEmpty) {
            throw new IllegalArgumentException(
                "Please pass in valid listValues to create a singly linked list."
            )
        }
        val head = new ListNode(listValues.head)
        var tmp = head
        for (i <- 1 until listValues.length) {
            val next = new ListNode(listValues(i))
            tmp.next = next
            tmp = tmp.next
        }
        head
    }
}
