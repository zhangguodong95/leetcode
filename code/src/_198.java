/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/23 10:55
 */

public class _198 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[][] dp = new int[nums.length][2];

        dp[0][0] = 0;
        dp[0][1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }
}
