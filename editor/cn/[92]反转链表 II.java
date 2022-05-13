package cn;
//给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链
//表节点，返回 反转后的链表 。
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], left = 2, right = 4
//输出：[1,4,3,2,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [5], left = 1, right = 1
//输出：[5]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目为 n 
// 1 <= n <= 500 
// -500 <= Node.val <= 500 
// 1 <= left <= right <= n 
// 
//
// 
//
// 进阶： 你可以使用一趟扫描完成反转吗？ 
// Related Topics 链表 👍 1270 👎 0

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int
 * val, ListNode next) { this.val = val; this.next = next; } }
 */
//class Solution {
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        if (head == null || head.next == null || left == right) {
//            return head;
//        }
//        // 迭代实现
//        //return iteratorReverse(head, left, right);
//        // 头插法
//        return headInsertReverse(head, left, right);
//    }
//
//    private ListNode headInsertReverse(ListNode head, int left, int right) {
//
//        // 前置节点
//        ListNode zeroNode = new ListNode(0, head);
//        ListNode leftNode = zeroNode;
//        int index = left;
//        // 找到反转部分头节点的前一个节点
//        while (leftNode != null && left -- > 1) {
//            leftNode = leftNode.next;
//        }
//
//        ListNode node = leftNode.next;   // 遍历光标节点
//        while (node != null && node.next != null && index < right) {
//            // 断开next节点，连接到leftNode
//            ListNode next = node.next;
//            node.next = node.next.next;
//            next.next = leftNode.next;
//            leftNode.next = next;
//            index++;
//        }
//        return zeroNode.next;
//    }
//
//    private ListNode iteratorReverse(ListNode head, int left, int right) {
//        ListNode curr = head;
//        ListNode prev = null;
//        ListNode leftNode = null;
//        ListNode successor = null;
//        int i = 1;
//        while (curr != null) {
//            if (i == left - 1) {
//                prev = curr;
//            }
//            if (i == left) {
//                leftNode = curr;
//            }
//            if (i == right) {
//                // 这里不会有npe，right <= head.size
//                successor = curr.next;
//                curr.next = null;
//                break;
//            }
//            curr = curr.next;
//            i++;
//        }
//        ListNode rightNode = reverse(leftNode);
//        leftNode.next = successor;
//        if (prev != null) {
//            prev.next = rightNode;
//            return head;
//        }
//        // prev为空表示left为1，从头开始反转，所以反转后的头节点为rightNode
//        return rightNode;
//    }
//
//    public ListNode reverse(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode prev = reverse(head.next);
//        head.next.next = head;
//        head.next = null;
//        return prev;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
