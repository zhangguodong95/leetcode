/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/25 15:41
 */
//编辑距离
public class _72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length() + 1;
        int n = word2.length() + 1;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) dp[i][0] = i;
        for (int j = 0; j < n; j++) dp[0][j] = j;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
            }
        }

        return dp[m - 1][n - 1];
    }
}
