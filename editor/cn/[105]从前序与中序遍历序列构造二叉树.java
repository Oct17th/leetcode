//package cn;
////给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，请构造二叉树并
////返回其根节点。
////
////
////
//// 示例 1:
////
////
////输入: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
////输出: [3,9,20,null,null,15,7]
////
////
//// 示例 2:
////
////
////输入: preorder = [-1], inorder = [-1]
////输出: [-1]
////
////
////
////
//// 提示:
////
////
//// 1 <= preorder.length <= 3000
//// inorder.length == preorder.length
//// -3000 <= preorder[i], inorder[i] <= 3000
//// preorder 和 inorder 均 无重复 元素
//// inorder 均出现在 preorder
//// preorder 保证 为二叉树的前序遍历序列
//// inorder 保证 为二叉树的中序遍历序列
////
//// Related Topics 树 数组 哈希表 分治 二叉树 👍 1559 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
//            return null;
//        }
//        List<Integer> arrayList = new ArrayList<>();
//        for (int i : preorder) {
//            arrayList.add(i);
//        }
//        return buildTree(arrayList, inorder, 0, inorder.length-1 );
//    }
//
//    public TreeNode buildTree(List<Integer> preorder, int[] inorder, int inorderStartIndex, int inorderEndIndex) {
//
//        if (preorder.size() == 0
//            || inorderStartIndex < 0 || inorderStartIndex >= inorder.length
//            || inorderEndIndex < 0 || inorderEndIndex >= inorder.length) {
//            return null;
//        }
//
//        int root = preorder.get(0);
//        int rootIndex = -1; // 默认root节点没找到，则该树遍历完了
//        for (int i = inorderStartIndex; i <= inorderEndIndex; i++) {
//            if (root == inorder[i]) {
//                rootIndex = i;
//                continue;
//            }
//        }
//        if (rootIndex == -1) {
//            return null;
//        }
//
//        preorder.remove(0);
//        TreeNode left = buildTree(preorder, inorder, inorderStartIndex, rootIndex - 1);
//        TreeNode right = buildTree(preorder, inorder, rootIndex + 1, inorderEndIndex);
//        return new TreeNode(root, left, right);
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
