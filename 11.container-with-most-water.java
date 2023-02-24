/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l<r){
            int left_h = height[l];
            int right_h = height[r];
            int min_h = Math.min(left_h, right_h);
            max = Math.max(max, min_h*(r-l));
            if(left_h < right_h) l++;
            else r--;
        }

        return max;
    }
}
// @lc code=end

