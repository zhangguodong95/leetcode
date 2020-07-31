## [剑指 Offer 51. 数组中的逆序对](https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/)

在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。

**示例 1:**

```
输入: [7,5,6,4]
输出: 5
```

### 思路分析

**归并排序**

在归并排序合并阶段进行统计逆序度

例如 5,7  和 3,4,6

首先从左边数组中取出5>3 那么 count = mid - i +1= 1- 0 + 1=2 也就是 3对应的逆序度是2

然后3赋值给缓存的数组，右边的数组向后进一位 5>4 那么 count += mid - i +1 = 2  也就是4对应的逆序度是2 总的逆序度就是4

然后右边的数组向后进一位 5<6 是有序的 不做操作

左边的数组向后进一位，7 > 6 同上可以得到逆序度是1 最后总逆序度就是5

```java
int i = left, j = mid + 1, k = 0;
        int[] cache = new int[right - left + 1];
        while (i <= mid && j <= right) {
            //是逆序的
            if (nums[i] > nums[j]) {
                count += mid - i + 1;
                cache[k++] = nums[j++];
            } else {
                cache[k++] = nums[i++];
            } 
        }
```

### 代码实现

```java
 public int reversePairs(int[] nums) {
        return mergeSort(0, nums.length - 1, nums);
    }

    public int mergeSort(int left, int right, int[] nums) {
        if (left>=right) return 0;
        int mid = left + (right - left) / 2;
        int count = mergeSort(left, mid, nums) + mergeSort(mid + 1, right, nums);
        int i = left, j = mid + 1, k = 0;
        int[] cache = new int[right - left + 1];
        while (i <= mid && j <= right) {
            //是逆序的
            if (nums[i] > nums[j]) {
                count += mid - i + 1;
                cache[k++] = nums[j++];
            } else {
                cache[k++] = nums[i++];
            } 
        }
        
        while (i<=mid) cache[k++] = nums[i++];
        while (j<=right) cache[k++] = nums[j++];
        System.arraycopy(cache, 0, nums, left, right - left + 1);
        return count;
    }

```

