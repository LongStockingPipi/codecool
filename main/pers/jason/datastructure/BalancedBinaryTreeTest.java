package pers.jason.datastructure;

/**
 * @author Jason
 * @date 2021/6/23 22:52
 * @description
 */
public class BalancedBinaryTreeTest {


  public void leftRotate() {

  }

}

class BalancedBinaryTree<T> {

  private T t;

  //平衡因子
  private int bf;

  private BalancedBinaryTree<T> leftChild;

  private BalancedBinaryTree<T> rightChild;

  public BalancedBinaryTree(T t) {
    this.t = t;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public int getBf() {
    return bf;
  }

  public void setBf(int bf) {
    this.bf = bf;
  }

  public BalancedBinaryTree<T> getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(BalancedBinaryTree<T> leftChild) {
    this.leftChild = leftChild;
  }

  public BalancedBinaryTree<T> getRightChild() {
    return rightChild;
  }

  public void setRightChild(BalancedBinaryTree<T> rightChild) {
    this.rightChild = rightChild;
  }
}
