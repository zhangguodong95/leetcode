/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/24 14:37
 */
//买卖股票
public class _123 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int n = prices.length;
        int[][][] dp = new int[n][3][2];

        for (int i = 0; i < n; i++) {
            dp[i][0][0] = 0;
            dp[i][0][1] = Integer.MIN_VALUE;
        }
        for (int k = 2; k > 0; k--) {
            dp[0][k][0] = 0;
            dp[0][k][1] = -prices[0];
        }

        for (int i = 1; i < n; i++) {
            for (int k = 2; k > 0; k--) {
                dp[i][k][0] = Math.max(dp[i - 1][k][0], dp[i - 1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i - 1][k][1], dp[i - 1][k - 1][0] - prices[i]);
            }
        }

        return dp[n-1][2][0];

    }
}
