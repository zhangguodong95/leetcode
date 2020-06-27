import org.junit.Test;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/5/25 15:26
 */
public class _153 {

    @Test
    public void test() {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
    }

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        //当left == right的时候就是最小值的时候
        while (left <right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {//表示右边是无序的 转折点一定在右边 同时一定不是Mid
                left = mid + 1;
            } else {//表示左边是无序的 在左边 同时mid有可能就是最小点
                right = mid;
            }
        }
        return nums[right];
    }



}
