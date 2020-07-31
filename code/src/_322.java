import org.junit.Test;

import java.util.Arrays;

//零钱兑换
public class _322 {

    @Test
    public void test() {
        int[] coins = {2, 5, 10, 1};
        System.out.println(coinChange(coins, 27));
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); //注意这一步使用来作为判断是否能成功转换的标志
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];

    }
}
