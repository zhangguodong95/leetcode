/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/26 10:57
 */

public class _403 {
    //小青蛙过河
    public boolean canCross(int[] stones) {
        if (stones.length <= 1 || stones == null) return false;
        int n = stones.length;
        if (stones[1] != 1) return false;

        boolean[][] dp = new boolean[n][n + 1];//dp[i][k]表示第i个小石头 能否通过前一个小石头j通过k步跳达
        dp[0][0] = true;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int k = stones[i] - stones[j];
                //小于等于才用判断 否则直接就是false 具体解释看思路分析
                if (k <= i) {
                    //最终要得到 dp[len -1][k]的值
                    dp[i][k] = dp[j][k - 1] || dp[j][k] || dp[j][k + 1];
                    //不同的j k也是不同的 所以最后一步的dp[i][k]可能也会有多个 但是我们只要一个满足就可以判断了
                    //这里加入提前结束的判断
                    if (i == n - 1 && dp[i][k]) {
                        return true;
                    }
                }
            }
        }
        //所有情况都遍历完了
        return false;
    }
}
