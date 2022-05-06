package cn;
//给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
//
// k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], k = 2
//输出：[2,1,4,3,5]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：head = [1,2,3,4,5], k = 3
//输出：[3,2,1,4,5]
// 
//
// 
//提示：
//
// 
// 链表中的节点数目为 n 
// 1 <= k <= n <= 5000 
// 0 <= Node.val <= 1000 
// 
//
// 
//
// 进阶：你可以设计一个只用 O(1) 额外内存空间的算法解决此问题吗？ 
//
// 
// 
// Related Topics 递归 链表 👍 1624 👎 0


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
//    public ListNode reverseKGroup(ListNode head, int k) {
//        if (head == null || head.next == null || k <= 0) {
//            return head;
//        }
//        /*
//        一遍遍历一边计算index，当index为n*k的时候，触发反转，反转k个元素
//         */
//        return reverseKGroup(head, null, head.next, k, 1);
//    }
//
//    /**
//     *
//     * @param head
//     * @param lastReverseTail
//     * @param next
//     * @param k
//     * @param index
//     * @return
//     */
//    public ListNode reverseKGroup(ListNode head, ListNode lastReverseTail, ListNode next, int k, int index) {
//        String x = (head == null ? null : head.val) + "," + (lastReverseTail == null ? null : lastReverseTail.val) + ","+ (next == null ? null : next.val) + "," + k + "," + index;
//        System.out.println("in:" + x);
//        // 链表尾退出
//        if (head == null || k <= 0) {
//            return head;
//        }
//        if (index % k == 0) {
//            System.out.println("reverse:" + x);
//            // 触发反转
//            if (lastReverseTail == null) {
//                //第一次反转
//                ListNode reverseHead = reverse(head, k, 1); // 翻转后的链表头
//                head.next = next;
//                lastReverseTail = head;
//                head = reverseHead;
//            } else {
//                ListNode reverseTail = lastReverseTail.next;// 准备翻转的链表头，翻转后为链表尾
//                ListNode reverseHead = reverse(reverseTail, k, 1); // 翻转后的链表头
//                lastReverseTail.next = reverseHead;
//                reverseTail.next = next;
//                lastReverseTail = reverseTail;
//            }
//        }
//        if (next == null) {
//            return head;
//        }
//        return reverseKGroup(head, lastReverseTail, next.next, k, index + 1);
//    }
//    public ListNode reverse(ListNode head, int k, int index) {
//        System.out.println("reverse_inner:" + head == null ? null : head.val + "," + k + "," + index);
//        // 链表尾，或遍历到k个元素则停止翻转，返回翻转后的链表头
//        if (head == null || head.next == null || index >= k) {
//            return head;
//        }
//        // next节点作为前置节点
//        ListNode prev = reverse(head.next, k, index + 1);
//        head.next.next = head;
//        head.next = null;
//        return prev;
//    }
//
//    //public ListNode reverseList(ListNode head) {
//    //    // 递归的出口是链表尾，一直遍历到链表尾才返回
//    //    if (head == null || head.next == null) {
//    //        return head;
//    //    }
//    //    ListNode prev = reverseList(head.next);
//    //    // 这里在处理head.next节点，在遍历过程中，持续处理head.next节点，将其prev断掉，next指向原prev节点
//    //    head.next.next = head;
//    //    head.next = null;
//    //    return prev;
//    //}
//}

//leetcode submit region end(Prohibit modification and deletion)
