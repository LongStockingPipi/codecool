package pers.jason;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Test {
  public static void main(String[] args) {

    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    TreeNode node3 = new TreeNode(3);
    TreeNode node2 = new TreeNode(2, node4, node5);
    TreeNode root = new TreeNode(1, node2, node3);
    int[] a = new int[]{1,2,6,7,0,0};
    merge(a, 4, new int[]{3,8}, 2);


    for(int i=0;i<6;i++) {
      System.out.print(a[i]);
    }
  }
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    getSite(head, n);
    return head;
  }

  private int getSite(ListNode node, int n) {
    int site;
    if(null == node.next) {
      site = 1;
    } else {
      site = getSite(node.next, n) + 1;
    }
    if(site == n+1) {
      ListNode p = node.next;
      node.next = p.next;
      p.next = null;
    }
    return site;
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    while(m != 0 && n != 0) {
      int p1 = nums1[m-1];
      int p2 = nums2[n-1];
      if(p1 > p2) {
        nums1[m+n-1] = p1;
        m--;
      } else if(p2 > p1) {
        nums1[m+n-1] = p2;
        n--;
      } else if(p2 == p1) {
        nums1[m+n-1] = p1;
        nums1[m+n-2] = p2;
        n--;
        m--;
      }
    }
  }

  static List<List<Integer>> res = new ArrayList<>();
  public static List<List<Integer>> levelOrderBottom(TreeNode root) {
    levelOrderBottom(root, 0);
    return res;
  }

  public static void levelOrderBottom(TreeNode root, int level) {
    if (root == null) return;
    if (res.size() <= level) res.add(0, new ArrayList<>());
    res.get(res.size() - level - 1).add(root.val);
    levelOrderBottom(root.left, level + 1);
    levelOrderBottom(root.right, level + 1);
  }

  private static void printList(List<List<Integer>> result) {
    for(int i=0;i<result.size();i++) {
      List<Integer> list = result.get(i);
      System.out.println();
      for(int j=0;j<list.size();j++) {
        System.out.print(list.get(j) + ",");
      }
    }
  }

  private static void inertNode(List<List<Integer>> result, TreeNode node, int n) {
    if(null != node) {
      if(result.size() < n) {
        result.add(n-1, new ArrayList<>());
      }
      inertNode(result, node.left, n+1);
      inertNode(result, node.right, n+1);
      List<Integer> list = result.get(result.size()-n);
      list.add(node.val);
    }
  }

  private static void print(TreeNode root, int k) {
    printNode(root);
    k--;
    if(k > 0) {
      printNode(root== null ? null : root.left);
      printNode(root == null ? null : root.right);
    }
  }

  private static void test(TreeNode root) {

  }

  private static void printNode(TreeNode node) {
    if(null == node) {
      System.out.print("null,");
    } else {
      System.out.print(node.val + ",");
    }

  }

  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}

