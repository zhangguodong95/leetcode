import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/5/31 8:58
 */
//查找二叉树每一行的最大值
public class _515 {
    @Test
    public void test() {
        TreeNode root = new TreeNode(3);
        TreeNode two = new TreeNode(9);
        TreeNode three = new TreeNode(20);
        TreeNode four = new TreeNode(15);
        TreeNode five = new TreeNode(17);
        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;

        List<Integer> res = largestValues(root);
        System.out.println(res);

    }
    //bfs
//    public List<Integer> largestValues(TreeNode root) {
//        if (root == null) return new ArrayList<>();
//        List<Integer> res = new ArrayList<Integer>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            Queue<TreeNode> nodes = new LinkedList<>(); //存储下一层的节点
//            //处理当前层
//            int max = Integer.MIN_VALUE;
//            for (TreeNode node : queue) {
//                max = node.val > max ? node.val : max;
//                if (node.left != null) nodes.offer(node.left);
//                if (node.right != null) nodes.offer(node.right);
//            }
//            res.add(max);
//            queue = nodes;
//        }
//
//        return res;
//    }

    //dfs 数组的坐标和 level 之间的对应关系要了解
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<TreeNode> visited = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        dfs(root,res,0);
        return res;

    }

    public void dfs(TreeNode root, List<Integer> res,int level) {
        //terminal
        if (root == null) return;

        //process current logic
        if (level == res.size()) res.add(root.val);
        else res.set(level, Math.max(root.val, res.get(level)));

        //drop down
        dfs(root.left, res, level + 1);
        dfs(root.right, res,level + 1);

    }
}
