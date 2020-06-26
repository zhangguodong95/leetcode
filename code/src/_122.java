//best-time-to-buy-and-sell-stock-ii
public class _122 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null) return 0;
        int n = prices.length;
        int[][] dp = new int[n][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }

        return dp[n - 1][0];
    }

//    {
//        int prev_0 = 0;
//        int prev_1 = -prices[0];
//
//        for (int i = 1; i < n; i++) {
//            int temp = prev_0;
//            prev_0 = Math.max(prev_0, prev_1 + prices[i]);
//            prev_1 = Math.max(prev_1, temp - prices[i]);
//        }
//    }





    //买卖股票的最佳时机
//    public int maxProfit(int[] prices) {
//        int total = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            if(prices[i + 1] > prices[i]) total += prices[i + 1] - prices[i];
//        }
//        return total;
//    }
}
