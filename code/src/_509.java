import org.junit.Test;

public class _509 {

    //使用递推的方法 使用数组将状态存储起来
    //递推是自底向上的思路
    public int fib(int N) {
        int[] nums = new int[N + 2];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i < N + 1; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[N];
    }
    @Test
    public void test() {
        int[] nums = new int[6];
        System.out.println(fib_2(5, nums));
    }
    //递归是自顶向下的思路
    public int fib_2(int N, int[] nums) {
        if (N <= 1) return N;

        if (nums[N] == 0) {
            nums[N] = fib_2(N - 1, nums) + fib_2(N - 2, nums);
        }

        return nums[N];

    }
}
