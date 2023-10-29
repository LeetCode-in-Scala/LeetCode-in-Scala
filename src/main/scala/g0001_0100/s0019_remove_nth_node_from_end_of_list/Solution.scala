package g0001_0100.s0019_remove_nth_node_from_end_of_list

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Two_Pointers #Linked_List
// #Algorithm_I_Day_5_Two_Pointers #Level_2_Day_3_Linked_List #Big_O_Time_O(L)_Space_O(L)

import com_github_leetcode.ListNode

object Solution {
    private var n: Int = 0

    def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
        this.n = n
        val node = new ListNode(0, head)
        removeNth(node)
        node.next
    }

    private def removeNth(node: ListNode): Unit = {
        if (node.next == null) {
            return
        }
        removeNth(node.next)
        n -= 1

        if (n == 0) {
            node.next = node.next.next
        }
    }
}
