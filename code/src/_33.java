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

    public static void main(String[] args) {
        int[] nums = {1, 3};
        int search = search(nums, 3);
        System.out.println(search);
    }
    public static int search(int[] nums, int target) {
        int min_index = findMin(nums);
        if (nums[nums.length - 1] == target) return nums.length - 1;
        int left = nums[nums.length - 1] < target ? 0 : min_index;
        int right = nums[nums.length -1] >target ? (nums.length - 1) : min_index;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
