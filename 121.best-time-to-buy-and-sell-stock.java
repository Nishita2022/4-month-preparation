/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    /**
     * @param prices
     * @return
     */
    public  static  int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices [0];

        for (int i = 0; i<prices.length; i++) {
             
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);

        }
        return maxProfit;
        
    }
}
// @lc code=end

