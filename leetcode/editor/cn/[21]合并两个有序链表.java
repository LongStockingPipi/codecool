//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 
// 👍 1781 👎 0


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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = l1;
        ListNode p1 = null;
        ListNode p2 = l1;

        ListNode p = l2;

        if(null == l1) {
            return l2;
        } else if(null == l2) {
            return l1;
        } else {
            if(l2.val <= l1.val) {
                p = l2.next;
                l2.next = l1;
                p1 = l2;
                head = l2;
            }
        }

        while(null != p) {
            if(null != p2) {
                if(p.val <= p2.val) {
                    ListNode p_ = p.next;
                    p1.next = p;
                    p1 = p;
                    p1.next = p2;
                    p = p_;
                } else {
                    p1 = p2;
                    p2 = p2.next;
                }
            } else {
                ListNode p_ = p.next;
                p1.next = p;
                p1 = p;
                p1.next = p2;
                p = p_;
            }
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
