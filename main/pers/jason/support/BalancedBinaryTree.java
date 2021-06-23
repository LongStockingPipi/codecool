package pers.jason.support;


/**
 * @author Jason
 * @date 2021/6/23 22:52
 * @description
 */
public class BalancedBinaryTree<T extends Comparable> {

  private int size;

  private BalancedBinaryNode root;

  public void rightRotate(BalancedBinaryNode root) {
    if(!root.hasLeftChild()) {
      throw new RuntimeException("右旋失败，root没有左子节点！");
    }
    BalancedBinaryNode leftChild = root.getLeftChild();
    if(leftChild.hasRightChild()) {
      root.setLeftChild(leftChild.getRightChild());
    } else {
      root.setLeftChild(null);
    }
    leftChild.setRightChild(root);
    root = leftChild;

    /*
           A
    B            C
  D   (E)
F
             A
    B     (E)     C
  D
F

        B
    D       A
  F       E   C

     */

  }

  public void addNode(BalancedBinaryNode node) {
    if(null == this.root) {
      this.root = node;
    } else {
      addTreeNode(this.root, node);
    }
  }

  public void addNode(T t) {
    BalancedBinaryNode node = new BalancedBinaryNode(t);
    addNode(node);
  }

  private void addTreeNode(BalancedBinaryNode root, BalancedBinaryNode node) {
    if(root.getT().compareTo(node.getT()) > 0) {
      if(root.hasLeftChild()) {
        addTreeNode(root.getLeftChild(), node);
      } else {
        root.setLeftChild(node);
      }
    } else if(root.getT().compareTo(node.getT()) < 0) {
      if(root.hasRightChild()) {
        addTreeNode(root.getRightChild(), node);
      } else {
        root.setRightChild(node);
      }
    }
  }

  public BalancedBinaryNode getRoot() {
    return root;
  }

  public void setRoot(BalancedBinaryNode root) {
    this.root = root;
  }

  public boolean isEmpty() {
    return null == this.root;
  }

  public void printTree() {
    if(null == this.root) {
      System.out.println("[]");
    } else {
      System.out.print("[");
      printNode(this.root);
      System.out.print("]");
    }
  }

  public static void main(String[] args) {
    BalancedBinaryTree<Integer> tree = new BalancedBinaryTree<>();
    tree.addNode(5);
    tree.addNode(7);
    tree.addNode(4);
    tree.addNode(3);
    tree.addNode(2);

    tree.printTree();
  }

  private void printNode(BalancedBinaryNode root) {
    if(root.hasLeftChild()) {
      System.out.print(",");
      printNode(root.getLeftChild());
    }
    System.out.print(",");
    System.out.print(root.getT());
    if(root.hasRightChild()) {
      System.out.print(",");
      printNode(root.getRightChild());
    }
  }
}

class BalancedBinaryNode<T extends Comparable> {

  private T t;

  //平衡因子
  private int bf;

  private BalancedBinaryNode<T> leftChild;

  private BalancedBinaryNode<T> rightChild;

  public BalancedBinaryNode(T t) {
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

  public BalancedBinaryNode<T> getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(BalancedBinaryNode<T> leftChild) {
    this.leftChild = leftChild;
  }

  public BalancedBinaryNode<T> getRightChild() {
    return rightChild;
  }

  public void setRightChild(BalancedBinaryNode<T> rightChild) {
    this.rightChild = rightChild;
  }

  public boolean hasLeftChild() {
    return null != this.leftChild;
  }

  public boolean hasRightChild() {
    return null != this.rightChild;
  }

  public void calculateBalanceFactor() {
//    if(null != this.leftChild) {
//      this.leftChild.calculateBalanceFactor();
//    }
//    if(null != this.rightChild) {
//      this.rightChild.calculateBalanceFactor();
//    }
    if(null == this.leftChild) {
      if(null == this.rightChild) {
        this.bf = 0;
      } else {
        this.bf = 0 - this.rightChild.getBf();
      }
    } else {
      if(null == this.rightChild) {
        this.bf = this.leftChild.getBf();
      } else {
        this.bf = this.leftChild.getBf() - this.rightChild.getBf();
      }
    }
  }
}
