/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/24 15:37
 */
//买卖股票 包含冷冻期
public class _309 {
    public int maxProfit(int[] prices) {
        if (prices.length<= 0 || prices == null ) return 0;
        int n = prices.length;
        int dp[][] = new int[n][2];

        dp[0][0] = 0;
        dp[1][0] = Math.max(0, prices[1] - prices[0]);
        dp[0][1] = -prices[0];
        dp[1][1] = Math.max(-prices[0], -prices[1]);

        for (int i = 2; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
        }

        return dp[n - 1][0];
    }
}
