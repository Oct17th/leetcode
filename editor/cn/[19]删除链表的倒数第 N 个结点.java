package cn;
//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针 👍 2025 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        // 快慢指针，先让快指针走n步，注意边界问题
//        ListNode fast = head;
//        ListNode slow = head;
//        while (n-- > 0) {
//            // 题目保证 n<=head.size
//            fast = fast.next;
//        }
//        if (fast == null) {
//            // 遍历到了队列尾，要移除的倒数第n个节点为head节点
//            return head.next;
//        }
//        while (fast != null && fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        // fast为第size-1个节点
//        // slow为第size-1-n个节点，移除第size-n个节点
//        slow.next = slow.next.next;
//        return head;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
