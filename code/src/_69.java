import org.junit.Test;

//sqrtx
public class _69 {
    @Test
    public void test() {
        System.out.println(mySqrt(1));
    }

    //可以转化成寻找最后一个小于等于给定值的元素来解答
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x;
        while (left < right) {
            int mid = left + (right - left ) / 2;
            if ( mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1)) return mid;
                else left = mid + 1;
            }

        }
        return left;
    }
}
