package pers.jason.sorting;

import pers.jason.sorting.insertionsort.DirectInsertionSorter;
import pers.jason.sorting.insertionsort.ShellSorter;

/**
 * @author Jason
 * @date 2021/8/4 23:10
 * @description
 */
public class CaseClass {

  public static void main(String[] args) {
//    int[] array = new int[]{6,1,2,7,3,9};
//    Sorter sorter = new DirectInsertionSorter();
//    sorter.sort(array);
//    for(int i=0;i<array.length;i++) {
//      System.out.print(" " + array[i]);
//    }
    //todo: 最大增量应该大于长度/2还是小于len/2 确认增量序列的几种算法
    int[] array = new int[]{2,5,7,5,9,0,1,3,54,6,11};
    Sorter sorter = new ShellSorter();
    sorter.sort(array);
  }

}
