package pers.jason.support;

import java.lang.reflect.Array;
import java.util.Iterator;

public class BinarySortTree<T extends Comparable> extends BinaryTree<T>{

  public BinarySortTree() {
  }

  public BinarySortTree(T t) {
    super(t);
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    return this.size == 0 && null == this.root
        && !this.root.hasLeftChild() && !this.root.hasRightChild();
  }

  @Override
  public boolean contains(T t) {
    TreeNode p = this.root;
    while(null != p) {
      int v = p.value().compareTo(t);
      if(v == 0) {
        return true;
      } else if(v > 0) {
        p = p.leftChild();
      } else {
        p = p.rightChild();
      }
    }
    return false;
  }

  @Override
  public Iterator<T> iterator() {
    return null;
  }

  @Override
  public Comparable[] toArray() {
    Comparable[] array = new Comparable[this.size];
    Integer i = 0;
    traversal(array, this.root, i);
    return array;
  }

  private void traversal(Comparable[] array, TreeNode p, int i) {
    if(p.hasLeftChild()) {
      traversal(array, p.leftChild(), i);
    }
    i++;
    array[i] = p.value();
    i++;
    if(p.hasRightChild()) {
      traversal(array, p.rightChild(), i);
    }
  }

  @Override
  public boolean add(T t) {
    if(null == this.root) {
      this.root = new TreeNode(t);
      this.size = 1;
      this.depth = 1;
    } else {
      TreeNode p = this.root;
      while(null != p) {
        if(p.value().compareTo(t) > 0) {
          if(p.hasLeftChild()) {
            p = p.leftChild();
          } else {
            p.setLeftChild(new TreeNode(t));
            this.size ++;
            break;
          }
        } else if(p.value().compareTo(t) < 0) {
          if(p.hasRightChild()) {
            p = p.rightChild();
          } else {
            p.setRightChild(new TreeNode(t));
            this.size ++;
            break;
          }
        } else {
          p.setValue(t);
          break;
        }
      }
    }
    return false;
  }


}
