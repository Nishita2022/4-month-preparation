/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
          int n = nums.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
           
            if(nums[mid] == target)
                return mid;
            
            else if(nums[low]<=nums[mid]){
               
                if(target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
              
                if(target>nums[mid] && target<=nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
       
        return -1;
    }
    
    public void main(String[] args){
       int nums[] = {4,5,6,7,0,1,2};
      System.out.println(search(nums, 4));
    }
}
// @lc code=end

