import org.junit.Test;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/24 16:05
 */
//任意K值的最大收益
public class _188 {

    @Test
    public void test() {
        int[] prices = {1, 2, 4};
        System.out.println(maxProfit(2, prices));
    }
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int n = prices.length;
        if (k > n / 2) return helper(prices);
        int[][][] dp = new int[n][k + 1][2];

        for (int i = 0; i < n; i++) {
            dp[i][0][0] = 0;
            dp[i][0][1] = Integer.MIN_VALUE;
        }
        for (int j = k; j > 0; j--) {
            dp[0][j][0] = 0;
            dp[0][j][1] = -prices[0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = k; j > 0; j--) {
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }

        return dp[n - 1][k][0];
    }

    private int helper(int[] prices) {
        int sum = 0;
        for (int i = 0; i <= prices.length - 2; i++) {
            if (prices[i] < prices[i + 1]) {
                sum += prices[i + 1] - prices[i];
            }
        }
        return sum;
    }
}
