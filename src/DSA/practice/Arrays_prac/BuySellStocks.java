// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

package DSA.practice.Arrays_prac;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<buy){
                buy = prices[i];
            }

            if(prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }

        return profit;

    }
}
