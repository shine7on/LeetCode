/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        
        ListNode pointer = head;
        // int value = head.val; // this is i
        ListNode checker = head.next; // this is j
        // int counter = 0;

        while (checker != null) {

            if (pointer.val != checker.val)  {
                pointer.next = checker;
                pointer = pointer.next;
            }
            
            checker = checker.next;
        }

        pointer.next = null; // terminate

        return head;
    }
}
// @lc code=end

