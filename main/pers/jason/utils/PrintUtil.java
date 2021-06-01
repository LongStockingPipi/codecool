package pers.jason.utils;

import java.util.Iterator;

/**
 * @author Jason
 * @date 2021/5/20 20:45
 * @description
 */
public class PrintUtil {

  public static void printIntArray(int[] array) {
    if(null == array) {
      System.out.println("the int array is null");
    } else if(array.length < 1) {
      System.out.println("the int array is empty");
    } else {
      for(int i=0;i<array.length;i++) {
        if(i==0) {
          System.out.print("[");
        }
        System.out.print(array[i]);
        if(i<array.length-1) {
          System.out.print(",");
        } else {
          System.out.print("]");
        }
      }
    }
  }

  public static <T> void printCollection(Iterable<T> iterable) {
    if(null == iterable) {
      System.out.print(" , null");
    } else {
      Iterator<T> iter = iterable.iterator();
      System.out.print(" , [");
      while(iter.hasNext()) {
        T s = iter.next();
        System.out.print(s + ",");
      }
      System.out.print("]");
    }
    System.out.println();
  }

}
