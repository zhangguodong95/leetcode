import java.util.Arrays;

public class _322 {

    public int coinChange(int[] coins, int amount) {
        //零钱兑换问题
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount + 1);
        dp[0] = 0;
        //dp[i] 表示总金额为i的时候 凑成总金额所需要的最少硬币数
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] < i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount? -1:dp[amount];

    }
}
