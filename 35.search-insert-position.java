/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
// class Solution {
//      public int searchInsert(int[] nums, int target) {
//          int i = 0;
//          int midindex = nums.length/2;

//          while (midindex =! 0) {
//             if (target < nums[midindext)
//             if (target > nums[midindex])

//          }
         
//          for (; i < nums.length; i++) {
//              int value = nums[i];

//              if (target == value) 
//                  return i;
//              else if (target < value)
//                  return i;
//         }

//          return nums.length;
//      }

//      public int findmiddle(int num) {

//      }
//  }

// linear serach
class Solution {
    public int searchInsert(int[] nums, int target) {
    int i = 0;

    for (; i < nums.length; i++) {
        int value = nums[i];

        if (target == value) 
            return i;
        else if (target < value)
            return i;
    }
    return nums.length;
    }
}

// @lc code=end

