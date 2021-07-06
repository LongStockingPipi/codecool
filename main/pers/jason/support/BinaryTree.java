package pers.jason.support;

public class BinaryTree<T> implements Tree<T> {

  private Node<T> root;

  private int size = 0;

  private int level = 0;

  public BinaryTree() {}

  @Override
  public String toString() {
    if(null == this.root) {
      return "null";
    }
    return this.root.toString();
  }

  class Node<T> {

    private T t;

    private Node<T> leftChild;

    private Node<T> rightChild;

    public Node(T t) {
      this.t = t;
    }

    public boolean hasLeftChild() {
      return null != this.leftChild;
    }

    public boolean hasRightChild() {
      return null != this.rightChild;
    }

    public T getValue() {
      return t;
    }

    public void setValue(T t) {
      this.t = t;
    }

    public Node<T> getLeftChild() {
      return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
      this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
      return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
      this.rightChild = rightChild;
    }

    @Override
    public String toString() {
      return getToString(this);
    }

    private String getToString(Node<T> node) {
      StringBuilder sb = new StringBuilder();
      if(node.hasLeftChild()) {
        sb.append(getToString(node.getLeftChild()));
      }
      sb.append(node.t.toString());
      if(node.hasRightChild()) {
        sb.append(getToString(node.getRightChild()));
      }
      return sb.toString();
    }
  }
}
