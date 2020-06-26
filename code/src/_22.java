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
        List<String> res = new ArrayList<String>();
        dfs(n,res,0,0,"");
        return res;
    }

    public void dfs(int n, List<String> res, int left, int right, String s) {
        //terminal
        if ((left + right) == 2 * n) {
            res.add(s);
            return;
        }

        //process current level and drop down
        if (left < n) dfs(n, res, left + 1, right, s + '(');
        if (right < left) dfs(n, res, left, right + 1, s + ')');

        //reverse state

    }
}
