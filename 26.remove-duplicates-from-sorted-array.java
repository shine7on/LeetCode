/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0; // start with the first
        int j = 1;
        // int value = nums[i];
        // int checker = nums[j];

        // int[] result;
        for (; j < nums.length; j++) {
            if (nums[i] != nums[j])
                i += 1;
                nums[i] = nums[j];
        }
        
        int result = i + 1;
        
        return result;
    }
}
// @lc code=end

