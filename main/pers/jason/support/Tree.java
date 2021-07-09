package pers.jason.support;

import java.util.Iterator;

public interface Tree<T> {

  int size();

  boolean isEmpty();

  boolean contains(T t);

  Iterator<T> iterator();

  boolean add(T t);

  Comparable[] toArray();

}


