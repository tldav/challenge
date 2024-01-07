package slidingWindow.easy._121_bestTimeToBuyAndSellStock;

class Solution {
    // Input: [7, 1, 5, 3, 6, 4]
    // Expect: 5
    
    public int solve(int[] prices) {
        int lowestPrice = prices[0];
        int profit = 0;
        for (int price : prices) {
            if (price < lowestPrice) {
                lowestPrice = price;
            } else if (price - lowestPrice > profit) {
                profit = price - lowestPrice;
            }
        }
        return profit;
    }
}
