/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/25 16:31
 */
//解码方式
public class _91 {

    public int numDecodings(String s) {

        if (s.length() == 0 || s == null) return 0;
        int n = s.length() + 1;
        int[] dp = new int[n];

        dp[0] = 1;
        if (s.charAt(0) == '0') return 0;
        dp[1] = 1;
        //dp[i] 对应的是s.charAt(i-1)
        for (int i = 2; i < n; i++) {
            int first = Integer.parseInt(s.substring(i-1,i));
            int second = Integer.parseInt(s.substring(i-2,i));

            if (first >=1 && first <=9)
                dp[i] += dp[i - 1];
            if (second >=10 && second <= 26)
                dp[i] += dp[i - 2];
        }
        return dp[n - 1];
    }
}
