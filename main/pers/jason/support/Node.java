package pers.jason.support;

/**
 * @author Jason
 * @date 2021/5/25 22:28
 * @description
 */
public class Node<T> {

  private T t;

  private Node<T> leftChild;

  private Node<T> rightChild;

  public Node() {}

  public Node(T t) {
    this.t = t;
  }

  public void setValue(T t) {
    this.t = t;
  }

  public T getValue() {
    return this.t;
  }

  public boolean hasLeftChild() {
    return null != this.leftChild;
  }

  public boolean hasRightChild() {
    return null != this.rightChild;
  }

  public void setLeftChild(Node<T> leftChild) {
    this.leftChild = leftChild;
  }

  public void setRightChild(Node<T> rightChild) {
    this.rightChild = rightChild;
  }

  public Node<T> getLeftChild() {
    return leftChild;
  }

  public Node<T> getRightChild() {
    return rightChild;
  }
}
