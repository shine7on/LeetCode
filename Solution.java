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
        if (head == null || head.next == null || head.next.next == null)
            return false;
        
        ListNode slowpointer = head.next;
        ListNode fastpointer = slowpointer.next;

        while (slowpointer != null && fastpointer != null) {
            if (slowpointer == fastpointer)
                return true;
            
            if (slowpointer.next == null || fastpointer.next == null || fastpointer.next.next == null)
                return false;
            
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;
        }
        
        return false;
    }
}
// @lc code=end

