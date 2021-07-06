//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
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
// Related Topics 链表 双指针 
// 👍 1437 👎 0


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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(null == head) {
            return null;
        }

        ListNode p2 = head;

        for(int i=0;i<n;i++) {
            p2 = p2.next;
        }

        if(null == p2) {
            head = head.next;
        } else {
            ListNode p1 = head;
            while(null != p2.next) {
                p1 = p1.next;
                p2 = p2.next;
            }
            remove(p1);
        }
        return head;
    }

    private void remove(ListNode parent) {
        ListNode p = parent.next;
        parent.next = p.next;
        p.next = null;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
