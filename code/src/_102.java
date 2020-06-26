import org.junit.Test;

import java.util.*;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/5/30 15:46
 */
//二叉树的层次遍历
public class _102 {

    @Test
    public void testBfs() {
        TreeNode root = new TreeNode(3);
        TreeNode two = new TreeNode(9);
        TreeNode three = new TreeNode(20);
        TreeNode four = new TreeNode(15);
        TreeNode five = new TreeNode(17);
        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
       // System.out.println(levelOrder(root));

        List<TreeNode> visited = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(root,visited,0,res);
        System.out.println(res);

    }

    //dfs 遍历二叉树
    public void dfs(TreeNode root,List<TreeNode> visited,int level,List<List<Integer>> res) {
        if (visited.contains(root)) return;
        // add and process current node
        visited.add(root);
        if (res.size() - 1 < level) res.add(new ArrayList<>());//如果没有这一步下一步添加就会报错
        res.get(level).add(root.val);

        if (root.left != null && !visited.contains(root.left)) dfs(root.left,visited,level+1,res);
        if (root.right != null && !visited.contains(root.right)) dfs(root.right, visited,level+1,res);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        //BFS
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> out = new ArrayList<>();
        queue.offer(root);
        if(root == null) return out; //边界条件判断
        while (!queue.isEmpty()) {
            ArrayList<Integer> child = new ArrayList<>(); //该轮循环的结果集
            Queue<TreeNode> nodes = new LinkedList<>(); //下一层的节点的集合
            for (TreeNode node : queue) { //把当前层的节点循环一遍 加入到当前层集合中
                child.add(node.val);
                if (node.left != null) nodes.offer(node.left); //判断每个节点是否有子节点 有就加入下一层队列中去
                if (node.right != null) nodes.offer(node.right);
            }
            out.add(child);
            queue = nodes;
        }
        return out;
    }


}
