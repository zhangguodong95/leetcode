## README

**leetcode题目分类**

### 1.数组

- #### [1. 两数之和](https://leetcode-cn.com/problems/two-sum/)

- #### [15. 三数之和](https://leetcode-cn.com/problems/3sum/)

- #### [11. 盛最多水的容器](https://leetcode-cn.com/problems/container-with-most-water/)

- #### [283. 移动零](https://leetcode-cn.com/problems/move-zeroes/)

### 2.Linked List 

- #### [206. 反转链表](https://leetcode-cn.com/problems/reverse-linked-list/)

- #### [234. 回文链表](https://leetcode-cn.com/problems/palindrome-linked-list/)（注意如果是两个Integer类型进行比较要用equals，有赞笔试真题，要学会在原地解决这个问题）

- #### [24. 两两交换链表中的节点](https://leetcode-cn.com/problems/swap-nodes-in-pairs/)

- #### [141. 环形链表](https://leetcode-cn.com/problems/linked-list-cycle/)

- #### [142. 环形链表 II](https://leetcode-cn.com/problems/linked-list-cycle-ii/)

- #### [25. K 个一组翻转链表](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/)（用递归的方法 要多写 经常问）

### 3.数组和链表

- #### [26. 删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/)

- #### [189. 旋转数组](https://leetcode-cn.com/problems/rotate-array/)

- #### [21. 合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists/)

- #### [88. 合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array/)

- #### [66. 加一](https://leetcode-cn.com/problems/plus-one/)

### 4.栈和队列（要分析java stack 和 queue,deque,priorty queue)

- #### [20. 有效的括号](https://leetcode-cn.com/problems/valid-parentheses/)

- #### [155. 最小栈](https://leetcode-cn.com/problems/min-stack/)

- #### [84. 柱状图中最大的矩形](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/)

- #### [239. 滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/)

- #### [641. 设计循环双端队列](https://leetcode-cn.com/problems/design-circular-deque/)

- #### [42. 接雨水](https://leetcode-cn.com/problems/trapping-rain-water/)

### 5.哈希表，映射，集合

- #### [242. 有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/)

- #### [49. 字母异位词分组](https://leetcode-cn.com/problems/group-anagrams/)

- #### [1. 两数之和](https://leetcode-cn.com/problems/two-sum/)

### 6.树，二叉树，二叉搜索树

- #### [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)

- #### [144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/)

- #### [590. N叉树的后序遍历](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/)

- #### [589. N叉树的前序遍历](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/)

- #### [429. N叉树的层序遍历](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/)

### 7.泛型递归、树的递归

​	**实战题目**

- #### [70. 爬楼梯](https://leetcode-cn.com/problems/climbing-stairs/)

- #### [22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/)

- #### [226. 翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/)

- #### [98. 验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree/)（需要重新看，多理解，中序遍历的一个应用）

- #### [104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)

- #### [111. 二叉树的最小深度](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/)（要考虑没有叶子节点的情况，即是null不是叶子节点）

- https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/

**课后作业**

- #### [236. 二叉树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/)（二叉树后续遍历的一个应用）

- #### [105. 从前序与中序遍历序列构造二叉树](https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)

- #### [77. 组合](https://leetcode-cn.com/problems/combinations/)

- #### [46. 全排列](https://leetcode-cn.com/problems/permutations/)

- #### [47. 全排列 II](https://leetcode-cn.com/problems/permutations-ii/)

### 8. 分治、回溯

**预习题目**

- #### [22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/)

- #### [50.Pow(x, n)](https://leetcode-cn.com/problems/powx-n/)

**回溯算法解题套路框架**

[	  套路框架](https://labuladong.gitbook.io/algo/di-ling-zhang-bi-du-xi-lie/hui-su-suan-fa-xiang-jie-xiu-ding-ban)

- #### [78. 子集](https://leetcode-cn.com/problems/subsets/)

- #### [46. 全排列](https://leetcode-cn.com/problems/permutations/)

- #### [77. 组合](https://leetcode-cn.com/problems/combinations/)

```
注意：向List<List<Integer>> res 中添加list 的时候 最好使用 res.add(new ArrayList(curr))
不要直接使用res.add(curr) 其中curr 为一个 ArrayList
```

**实战题目**

- [https://leetcode-cn.com/problems/majority-element/description/ ](https://leetcode-cn.com/problems/majority-element/description/)（简单、但是高频）

- https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/

- https://leetcode-cn.com/problems/n-queens/

- #### [79. 单词搜索](https://leetcode-cn.com/problems/word-search/)

### 9.深度优先搜索和广度优先搜索

- #### [22.括号生成](https://github.com/zhangguodong95/leetcode/blob/master/22.%20%E6%8B%AC%E5%8F%B7%E7%94%9F%E6%88%90.md#22-%E6%8B%AC%E5%8F%B7%E7%94%9F%E6%88%90)

- #### [102. 二叉树的层序遍历](https://github.com/zhangguodong95/leetcode/blob/master/102.%20%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86.md#102-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86)

- #### [200.岛屿数量](https://github.com/zhangguodong95/leetcode/blob/master/200.%20%E5%B2%9B%E5%B1%BF%E6%95%B0%E9%87%8F.md#200-%E5%B2%9B%E5%B1%BF%E6%95%B0%E9%87%8F)

- #### [515. 在每个树行中找最大值](https://github.com/zhangguodong95/leetcode/blob/master/515.%20%E5%9C%A8%E6%AF%8F%E4%B8%AA%E6%A0%91%E8%A1%8C%E4%B8%AD%E6%89%BE%E6%9C%80%E5%A4%A7%E5%80%BC.md#515-%E5%9C%A8%E6%AF%8F%E4%B8%AA%E6%A0%91%E8%A1%8C%E4%B8%AD%E6%89%BE%E6%9C%80%E5%A4%A7%E5%80%BC)


### 10.贪心算法

- #### [860. 柠檬水找零](https://leetcode-cn.com/problems/lemonade-change/)

- #### [122. 买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/)

- #### [455. 分发饼干](https://leetcode-cn.com/problems/assign-cookies/)

- #### [874. 模拟行走机器人](https://leetcode-cn.com/problems/walking-robot-simulation/)

- #### [55. 跳跃游戏](https://leetcode-cn.com/problems/jump-game/)

- #### [45. 跳跃游戏 II](https://leetcode-cn.com/problems/jump-game-ii/)


### 11.二分查找

- #### [69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)

- #### [367. 有效的完全平方数](https://leetcode-cn.com/problems/valid-perfect-square/)

- #### [33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/)

- #### [74. 搜索二维矩阵](https://leetcode-cn.com/problems/search-a-2d-matrix/)

- #### [153. 寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/)


### 12.动态规划（初级）

- #### [509. 斐波那契数](https://leetcode-cn.com/problems/fibonacci-number/)  一维数组

- #### [62. 不同路径](https://leetcode-cn.com/problems/unique-paths/)  二维数组

- #### [63. 不同路径 II](https://leetcode-cn.com/problems/unique-paths-ii/)

- #### [1143. 最长公共子序列](https://leetcode-cn.com/problems/longest-common-subsequence/)

- #### [120. 三角形最小路径和](https://leetcode-cn.com/problems/triangle/) 

- #### [322. 零钱兑换](https://leetcode-cn.com/problems/coin-change/)

- #### [53. 最大子序和](https://leetcode-cn.com/problems/maximum-subarray/)

- #### [152. 乘积最大子数组](https://leetcode-cn.com/problems/maximum-product-subarray/)

- #### [70. 爬楼梯](https://leetcode-cn.com/problems/climbing-stairs/)  

- **实战题目**

- #### [198. 打家劫舍](https://leetcode-cn.com/problems/house-robber/)

- #### [213. 打家劫舍 II](https://leetcode-cn.com/problems/house-robber-ii/)

- #### [121. 买卖股票的最佳时机](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/)

- #### [122. 买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/)

- #### [123. 买卖股票的最佳时机 III](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii/)

- #### [309. 最佳买卖股票时机含冷冻期](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)

- #### [188. 买卖股票的最佳时机 IV](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv/)

- #### [714. 买卖股票的最佳时机含手续费](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)

- #### [一个方法团灭6道股票问题](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/solution/yi-ge-fang-fa-tuan-mie-6-dao-gu-piao-wen-ti-by-l-3/)

- **家庭作业**

- #### [32. 最长有效括号](https://leetcode-cn.com/problems/longest-valid-parentheses/)

- #### [64. 最小路径和](https://leetcode-cn.com/problems/minimum-path-sum/)

- #### [72. 编辑距离](https://leetcode-cn.com/problems/edit-distance/)   很重要

- #### [91. 解码方法](https://leetcode-cn.com/problems/decode-ways/)

- #### [221. 最大正方形](https://leetcode-cn.com/problems/maximal-square/)

- #### [363. 矩形区域不超过 K 的最大数值和](https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/)

- #### [403. 青蛙过河](https://leetcode-cn.com/problems/frog-jump/)

- #### [410. 分割数组的最大值](https://leetcode-cn.com/problems/split-array-largest-sum/)

- #### [552. 学生出勤记录 II](https://leetcode-cn.com/problems/student-attendance-record-ii/)

- #### [1262. 可被三整除的最大和](https://leetcode-cn.com/problems/greatest-sum-divisible-by-three/)（有赞笔试真题）

-    **最长上升子序列问题**

- #### [300. 最长上升子序列](https://leetcode-cn.com/problems/longest-increasing-subsequence/)

- #### [354. 俄罗斯套娃信封问题](https://leetcode-cn.com/problems/russian-doll-envelopes/)（字节跳动原题）

- #### [424. 替换后的最长重复字符](https://leetcode-cn.com/problems/longest-repeating-character-replacement/)（字节原题 滑动窗口问题）


### 13.字典树和并查集（uninon find)

- #### [212. 单词搜索 II](https://leetcode-cn.com/problems/word-search-ii/)

- #### [208. 实现 Trie (前缀树)](https://leetcode-cn.com/problems/implement-trie-prefix-tree/)

- #### [547. 朋友圈](https://leetcode-cn.com/problems/friend-circles/)

- #### [200. 岛屿数量](https://leetcode-cn.com/problems/number-of-islands/)

- #### [130. 被围绕的区域](https://leetcode-cn.com/problems/surrounded-regions/)

### 14.高级搜索

### 15.红黑树和AVL树

### 16.位运算

- #### [191. 位1的个数](https://leetcode-cn.com/problems/number-of-1-bits/)（使用技巧 n & (n-1)是清除n二进制位的最后一个0）

- #### [231. 2的幂](https://leetcode-cn.com/problems/power-of-two/)（如果一个数是2的幂 那么二进制表达只有一个1）

- #### [190. 颠倒二进制位](https://leetcode-cn.com/problems/reverse-bits/)

- #### [338. 比特位计数](https://leetcode-cn.com/problems/counting-bits/)

- #### [51. N皇后](https://leetcode-cn.com/problems/n-queens/)

- #### [52. N皇后 II](https://leetcode-cn.com/problems/n-queens-ii/)

### 17.布隆过滤器和LRU缓存

​	布隆过滤器用一个很长的二进制向量和一系列随机映射函数。判断一个元素是否在一个集合中。

​	优点：空间效率和查询时间都远远超过一般的算法。

​	缺点：有一定的误识别率和删除困难

​		**在是可能在，不在就是一定不在**

- [布隆过滤器的原理和实现](https://www.cnblogs.com/cpselvis/p/6265825.html)
- [使用布隆过滤器解决缓存击穿、垃圾邮件识别、集合判重](https://blog.csdn.net/tianyaleixiaowu/article/details/74721877)
- [布隆过滤器 Java 实现示例      1](https://github.com/lovasoa/bloomfilter/blob/master/src/main/java/BloomFilter.java)
- [布隆过滤器 Java 实现示例      2](https://github.com/Baqend/Orestes-Bloomfilter)

- #### [146. LRU缓存机制](https://leetcode-cn.com/problems/lru-cache/)

### 18.排序算法

#### [	十大经典排序算法讲解](https://www.cnblogs.com/onepixel/p/7674659.html)

- #### 堆的实现 要熟练 面试会考

- #### [1122. 数组的相对排序](https://leetcode-cn.com/problems/relative-sort-array/)

- #### [242. 有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/)

- #### [56. 合并区间](https://leetcode-cn.com/problems/merge-intervals/)（注意本题的代码需要好好理解）

  ```
  //将一个二维数组按照每个一维数组的首字母排序
  Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
  result.toArray(new int[result.size()][]);
  ```

- #### [493. 翻转对](https://leetcode-cn.com/problems/reverse-pairs/)（泛型 逆序对问题 很常见要重视）

- #### [剑指 Offer 51. 数组中的逆序对](https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/)

### 19.高级动态规划



### 20.字符串

- **字符串基础问题**

- #### [709. 转换成小写字母](https://leetcode-cn.com/problems/to-lower-case/)

- #### [58. 最后一个单词的长度](https://leetcode-cn.com/problems/length-of-last-word/)

- #### [771. 宝石与石头](https://leetcode-cn.com/problems/jewels-and-stones/)

- #### [387. 字符串中的第一个唯一字符](https://leetcode-cn.com/problems/first-unique-character-in-a-string/)

- #### [8. 字符串转换整数 (atoi)](https://leetcode-cn.com/problems/string-to-integer-atoi/)

- **字符串操作问题**

- #### [14. 最长公共前缀](https://leetcode-cn.com/problems/longest-common-prefix/) （使用StringBuilder添加的速度远远快于字符串拼接）

- #### [344. 反转字符串](https://leetcode-cn.com/problems/reverse-string/)

- #### [541. 反转字符串 II](https://leetcode-cn.com/problems/reverse-string-ii/)（需要多写几遍 ）

- #### [151. 翻转字符串里的单词](https://leetcode-cn.com/problems/reverse-words-in-a-string/)

- https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/

- https://leetcode-cn.com/problems/reverse-only-letters/

- **异位词问题**

- https://leetcode-cn.com/problems/valid-anagram/
- https://leetcode-cn.com/problems/group-anagrams/
- https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/

- **回文串问题**

- https://leetcode-cn.com/problems/valid-palindrome/
- https://leetcode-cn.com/problems/valid-palindrome-ii/
- https://leetcode-cn.com/problems/longest-palindromic-substring/

- **最长子串、子序列问题**

- #### [1143. 最长公共子序列](https://leetcode-cn.com/problems/longest-common-subsequence/)（它还有变换形式 最长公共子串）

- #### [72. 编辑距离](https://leetcode-cn.com/problems/edit-distance/)

- #### [5. 最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/)

- **字符串+DP问题**

- https://leetcode-cn.com/problems/regular-expression-matching/
- https://leetcode-cn.com/problems/regular-expression-matching/solution/ji-yu-guan-fang-ti-jie-gen-xiang-xi-de-jiang-jie-b/（重点）
- https://leetcode-cn.com/problems/wildcard-matching/
- https://leetcode-cn.com/problems/distinct-subsequences/

### 剑指 offer

- #### [剑指 Offer 14- I. 剪绳子](https://leetcode-cn.com/problems/jian-sheng-zi-lcof/)

### 高频题

- #### [22.括号生成](https://github.com/zhangguodong95/leetcode/blob/master/22.%20%E6%8B%AC%E5%8F%B7%E7%94%9F%E6%88%90.md#22-%E6%8B%AC%E5%8F%B7%E7%94%9F%E6%88%90)

- #### [102. 二叉树的层序遍历](https://github.com/zhangguodong95/leetcode/blob/master/102.%20%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86.md#102-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86)

- #### [126. 单词接龙 II](https://leetcode-cn.com/problems/word-ladder-ii/)



