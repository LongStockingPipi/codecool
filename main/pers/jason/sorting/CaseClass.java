package pers.jason.sorting;

import pers.jason.sorting.directinsertionsort.DirectInsertionSorter;

/**
 * @author Jason
 * @date 2021/8/4 23:10
 * @description
 */
public class CaseClass {

  public static void main(String[] args) {
    int[] array = new int[]{6,1,2,7,3,9};
    Sorter sorter = new DirectInsertionSorter();
    sorter.sort(array);
    for(int i=0;i<array.length;i++) {
      System.out.print(" " + array[i]);
    }
  }

}
