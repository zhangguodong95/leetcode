import org.junit.Test;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/23 15:09
 */
//打家劫舍2
public class _213 {

    @Test
    public void test() {
        int[] nums = {2, 3, 2};
        System.out.println(rob(nums));
    }

    public int rob(int[] nums) {
        //分成两种情况(0,nums.length-1),(1,nums.length)
        if (nums == null || nums.length ==  2 ||nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(helper(nums, 0, nums.length - 2),
                helper(nums, 1, nums.length - 1));
    }

    public int helper(int[] nums, int start, int end) {
        int[][] dp = new int[nums.length][2];

        dp[start][0] = 0;
        dp[start][1] = nums[start];

        for (int i = start + 1; i < end + 1; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }

        return Math.max(dp[end][0], dp[end][1]);
    }
}
