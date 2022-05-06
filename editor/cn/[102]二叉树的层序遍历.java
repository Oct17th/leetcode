package cn;
//给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
//
// 
//
// 示例 1： 
//
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[9,20],[15,7]]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：[[1]]
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 2000] 内 
// -1000 <= Node.val <= 1000 
// 
// Related Topics 树 广度优先搜索 二叉树 👍 1311 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        return dfs(root);
//        //执行耗时:0 ms,击败了100.00% 的Java用户
//        //内存消耗:41.2 MB,击败了80.78% 的Java用户
//        //return bfs(root);
//        //执行耗时:1 ms,击败了61.99% 的Java用户
//        //内存消耗:41.6 MB,击败了29.21% 的Java用户
//    }
//    /**
//     * 深度优先遍历
//     *
//     * @param root
//     */
//    public List<List<Integer>> dfs(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        return dfs(root, 1, result);
//    }
//
//    public List<List<Integer>> dfs(TreeNode root, int level, List<List<Integer>> result) {
//        if (root == null) {
//            return result;
//        }
//        if (level > result.size()) {
//            result.add(new ArrayList<>());
//        }
//        List<Integer> valueList = result.get(level - 1);
//        valueList.add(root.val);
//        dfs(root.left, level + 1, result);
//        dfs(root.right, level + 1, result);
//        return result;
//    }
//
//    /**
//     * 广度优先遍历
//     *
//     * @param root
//     */
//    public List<List<Integer>> bfs(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            // 本层节点值
//            List<Integer> valueList = new ArrayList<>(size);
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                valueList.add(node.val);
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//            }
//            result.add(valueList);
//        }
//        return result;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
