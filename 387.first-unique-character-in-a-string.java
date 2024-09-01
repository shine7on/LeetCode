/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        if (s == null)
            return -1;

        if (s.length() == 1)
            return 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            int counter = 0;

            for (int j = 0; j < s.length(); j++) {
                char checker = s.charAt(j);

                if (letter == checker)
                    counter++;
                
                if (counter > 1)
                    break;
            }

            if (counter == 1)
                return i;
        }
        
        return -1;
    }
}
// @lc code=end

