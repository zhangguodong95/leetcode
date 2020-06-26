/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/22 10:55
 */

public class _70 {
    public int climbStairs(int n) {

        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;dp[0] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
