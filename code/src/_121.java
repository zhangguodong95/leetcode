/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/23 16:58
 */

public class _121 {
    public int maxProfit(int[] prices) {

        if (prices.length == 0 || prices == null) return 0;

        int prev_0= 0;
        int prev_1 = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            prev_0 = Math.max(prev_0, prev_1 + prices[i]);
            prev_1= Math.max(prev_1, -prices[i]);
        }

        return prev_0;

    }
}
