/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1;
        while(l<r){
            int mid = l+ (r-l)/2;
            if(nums[mid]>nums[r]) l=mid+1;
            else if(nums[mid]<nums[r]) r=mid;
            else 
            return nums[r];
        }

        return nums[l];
    }
}
// @lc code=end

