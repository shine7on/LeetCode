/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head.next == null)
            return false;
        
        ListNode pointer = head.next;

        int index = 1;
        head.val = 0;

        while (pointer != null) {
            if (index > pointer.next.val)
                return true;
            else
                pointer.val = index;
            
            index++;
        }

        return false;
    }
}
// @lc code=end

