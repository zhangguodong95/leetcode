import org.junit.Test;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/5/27 21:23
 */

public class _33 {
    /*
        1.找到循环数组中最小元素的角标
        2.判断所要寻找的值的范围在哪个有序数组的范围内
        3.在有序数组中使用二分查找 查找固定值
     */

    //直接使用二分查找
    @Test
    public void test() {
        int[] nums = {1, 3};
        int target = 3;
        System.out.println(search(nums,3));
    }
    public  int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) return mid;
            //首先判断左边有序还是右边有序
            if (nums[mid] >= nums[left]) {//左边有序
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }



}
