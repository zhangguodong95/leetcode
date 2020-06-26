import java.util.Arrays;

//assign cookies
public class _455 {

    public int findContentChildren(int[] g, int[] s) {
        //对两个数组排序
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) i++;
            j++;
        }
        return i;
    }
}
