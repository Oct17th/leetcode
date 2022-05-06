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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> nodeList = new ArrayList();
        nodeList.add(root);
        levelOrder(nodeList, result);
        return result;
    }

    /**
     写入本层节点并记录叶子节点
     */
    public void levelOrder(List<TreeNode> nodeList, List<List<Integer>> result) {
        if (nodeList == null || nodeList.size() == 0) {
            return;
        }
        // 本层的值
        List<Integer> nodeValueList = new ArrayList(nodeList.size());
        List<TreeNode> childNodeList = new ArrayList();
        for (TreeNode node : nodeList) {
            nodeValueList.add(node.val);
            if (node.left != null) {
                childNodeList.add(node.left);
            }
            if (node.right != null) {
                childNodeList.add(node.right);
            }
        }
        result.add(nodeValueList);
        levelOrder(childNodeList, result);
        return;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
