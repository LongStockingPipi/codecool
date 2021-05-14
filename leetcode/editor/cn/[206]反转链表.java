//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
// 
// 
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
// 
//
// 示例 2： 
//
// 
//输入：head = [1,2]
//输出：[2,1]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目范围是 [0, 5000] 
// -5000 <= Node.val <= 5000 
// 
//
// 
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？ 
// 
// 
// Related Topics 链表 
// 👍 1733 👎 0


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
class Solution {
    public ListNode reverseList(ListNode head) {
        return way2(head);
    }

    /**
     * 递归
     * @param head
     * @return
     */
    private ListNode way2(ListNode head) {
        if(null == head || null == head.next) {
            return head;
        } else {
            ListNode end = way2(head.next);
            head.next.next = head;
            head.next = null;//防止原连表头元素依然保持原始链接，形成环
            return end;
        }
    }

    /**
     * 迭代 + 双指针 方式
     * @param head
     * @return
     */
    private ListNode way1(ListNode head) {
        ListNode p3 = null;
        ListNode p1 = head;
        ListNode p2 = null;
        while(null != p1) {
            p3 = p1.next;
            p1.next = p2;

            p2 = p1;
            p1 = p3;
        }
        return p2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
