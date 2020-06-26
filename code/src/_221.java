/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/24 21:37
 */
//最大正方形
public class _221 {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        int max_stage = 0;

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    max_stage = Math.max(max_stage, dp[i][j]);
                }
            }
        }

        return max_stage * max_stage;
    }
}
