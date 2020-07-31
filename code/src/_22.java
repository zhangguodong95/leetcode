import java.util.ArrayList;
import java.util.List;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/3 14:38
 */
//括号生成
public class _22 {
    //dfs 加上分治回溯的思想
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n, "", res, 0, 0);
        return res;
    }

    public void helper(int n, String s, List<String> res, int left, int right) {
        if (left + right == 2 * n) {
            res.add(s);
            return;
        }
        if (left < n)
            helper(n, s + '(', res, left + 1, right);
        if (right < left)
            helper(n, s + ')', res, left, right + 1);
    }
}
