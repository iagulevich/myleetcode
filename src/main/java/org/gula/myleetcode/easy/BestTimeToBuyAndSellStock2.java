package org.gula.myleetcode.easy;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int m = 0;
        for (int i = 0; i < n - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                m += prices[i + 1] - prices[i];
            }
        }
        return m;
    }
}
