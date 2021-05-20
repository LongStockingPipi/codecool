package pers.jason.sorting.quicksort;

import pers.jason.sorting.Sorter;

public class QuickSorter implements Sorter {

  @Override
  public int[] sort(int[] array) {

    return new int[0];
  }
  /*
  5,3,7,2,1,9,8,4,6
  3,5,7,2,1,9,8,4,6
  3,2,7,5,1,9,8,4,6




   */

  private int divide(int[] array) {
    if(array.length == 1) {
      return array[0];
    }
    int mid = array[0];
    int[] left;
    int[] right;
    for(int i=1;i<array.length;i++) {

    }
    return 0;
  }

}
