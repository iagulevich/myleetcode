package org.gula.myleetcode.medium;

public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int[][] dp = initResults(amount, coins);
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                int k = j - coins[i - 1];
                dp[i][j] = dp[i - 1][j] + (k >= 0 ? dp[i][k] : 0);
            }
        }
        return dp[coins.length][amount];
    }

    private int[][] initResults(int amount, int[] coins) {
        int dp[][] = new int[coins.length + 1][amount + 1];
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = 0;
        }
        return dp;
    }

    private void printMatrix(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print("| dp[" + i + "],[" + j + "]=" + dp[i][j] + "  ");
            }
            System.out.println("|");
        }
    }

    public int change2(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
//        int change = new CoinChange2().change(5, new int[]{1, 2, 5});
//        System.out.println("change:" + change);

        int change = new CoinChange2().change2(5, new int[]{1, 2, 5});
        System.out.println("change:" + change);
    }
}

