/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/24 16:36
 */
//买卖股票 包含手续费
public class _714 {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length <= 1 || prices == null) return 0;
        int n = prices.length;

        int prev_0 = 0;
        int prev_1 = -prices[0] - fee;

        for (int i = 1; i < n; i++) {
            int temp = prev_0;
            prev_0 = Math.max(prev_0, prev_1 + prices[i]);
            prev_1 = Math.max(prev_1, temp - prices[i] - fee);
        }

        return prev_0;
    }
}
