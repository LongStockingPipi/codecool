package pers.jason.support;

import java.util.Iterator;

/**
 *
 * @param <T>
 */
public abstract class BinaryTree<T extends Comparable>
    implements Tree<T>, java.io.Serializable {

  private static final long serialVersionUID = 8683452581122892189L;

  protected int size;

  protected int depth;

  protected TreeNode root;

  public BinaryTree() {
    this.size = 0;
    this.depth = 0;
  }

  public BinaryTree(T t) {
    TreeNode root = new TreeNode(t);
    this.root = root;
    this.size = 1;
    this.depth = 1;
  }

  class TreeNode {

    private T t;

    private TreeNode leftChild;

    private TreeNode rightChild;

    public TreeNode(T t) {
      this.t = t;
    }

    public boolean hasLeftChild() {
      return null != leftChild;
    }

    public boolean hasRightChild() {
      return null != rightChild;
    }

    public void setLeftChild(TreeNode leftChild) {
      this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
      this.rightChild = rightChild;
    }

    public TreeNode leftChild() {
      return this.leftChild;
    }

    public TreeNode rightChild() {
      return this.rightChild;
    }

    public T value() {
      return this.t;
    }

    public void setValue(T t) {
      this.t = t;
    }

  }
}
