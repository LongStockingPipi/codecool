package pers.jason.sorting.selectionsort;

import pers.jason.sorting.Sorter;

/**
 * @author Jason
 * @date 2021/8/28 20:35
 * @description
 */
public class SimpleSelectionSort implements Sorter {

  @Override
  public int[] sort(int[] array) {
    for(int i=0;i<array.length;i++) {
      int p = i;
      for(int j=i;j<array.length;j++) {
        if(array[p] > array[j]) {
          p = j;
        }
      }
      swap(array, i, p);
    }
    return array;
  }


  private void swap(int[] array, int x, int y) {
    int p = array[x];
    array[x] = array[y];
    array[y] = p;
  }

}
