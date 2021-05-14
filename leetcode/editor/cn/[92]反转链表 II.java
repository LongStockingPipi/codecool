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
// Related Topics 链表 
// 👍 901 👎 0


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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode p1 = head;
        ListNode p3 = null;
        ListNode starter1 = null;
        ListNode starter2 = null;
        for(int count=1;;count++) {
            if(i == right+1) {
                break;
            }
            if(i == left-1) {
                starter1 = head.next;
                starter2 = head;
            }
            if(i == right) {
                starter1.next = p1.next;
                starter2.next = p1;
            } else if(i >= left && i< right) {
                p3 = p1.next;
                p1.next.next = p1;
                p1 = p3;
            }
            head = head.next;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
