package pers.jason;

import pers.jason.support.Tree;

import java.util.*;

public class Test {
  public static void main(String[] args) {
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    TreeNode node3 = new TreeNode(3);
    TreeNode node2 = new TreeNode(2, node4, node5);
    TreeNode node1 = new TreeNode(1, node2, node3);
    test(node1);
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

