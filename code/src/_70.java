/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/22 10:55
 */

public class _70 {


    public int climbStairs(int n) {
        //dp[i] 表示走到第i个台阶共有多少种方法
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[n] = dp[n - 1] + dp[n - 2];
        }
        return dp[n];

    }


}
