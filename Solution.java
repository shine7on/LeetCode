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
        if (head == null)
            return false;

        if (head.next == null)
            return false;
        
        ListNode main = head;
        ListNode checker = head.next;

        while (main != checker) {
            if (checker == null )
                return false;
                
            if (main.next == null)
                return false;

            main = main.next;
            checker = checker.next.next;
        }

        return true;
    }
}
// @lc code=end

