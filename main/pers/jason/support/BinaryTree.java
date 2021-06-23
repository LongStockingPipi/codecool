package pers.jason.support;

/**
 * @author Jason
 * @date 2021/5/25 22:24
 * @description
 */
public class BinaryTree<T> implements Tree<T>{

  private Node<T> root;

  public Node<T> getRoot() {
    return root;
  }

  public void setRoot(Node<T> root) {
    this.root = root;
  }

  public void traverse() {
    traverse(this.root);
  }

  private void traverse(Node<T> root) {
    if(root.hasLeftChild()) {
      traverse(root.getLeftChild());
    }
    System.out.println(this.root.getValue().toString());
    if(root.hasRightChild()) {
      traverse(root.getRightChild());
    }
  }

}
