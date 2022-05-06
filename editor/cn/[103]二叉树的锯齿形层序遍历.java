//给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[20,9],[15,7]]
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
// -100 <= Node.val <= 100 
// 
// Related Topics 树 广度优先搜索 二叉树 👍 633 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        return bfs(root);
    }

    /**
     * 广度优先
     *
     * @param root
     * @return
     */
    private List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1;// 单数左到右遍历，双数右到左遍历
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> valueList = new ArrayList<>(size);
            // 本层的节点按压入队列的顺序读取值，下一层的节点，逆序重新写入队列
            Stack<TreeNode> nodeStack = new Stack<TreeNode>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                valueList.add(node.val);
                nodeStack.push(node);
            }
            while (!nodeStack.isEmpty()) {
                TreeNode node = nodeStack.pop();
                if (level % 2 == 0) {
                    // 本层为双数，下一层为单数，应左到右遍历
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                } else {
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                }
            }
            level++;
            result.add(valueList);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)



