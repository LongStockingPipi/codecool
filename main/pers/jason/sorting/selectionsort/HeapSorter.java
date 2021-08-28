package pers.jason.sorting.selectionsort;

import pers.jason.sorting.Sorter;

/**
 * @author Jason
 * @date 2021/8/28 2:17
 * @description
 */
public class HeapSorter implements Sorter {

  @Override
  public int[] sort(int[] array) {
    heapAdjust(array);
    for(int i=array.length-1;i>0;i--) {
      swap(array, 0, i);
      adjust(array, 0, i);
    }
    return array;
  }

  /**
   * 构建大顶堆
   * @param array
   */
  private void heapAdjust(int[] array) {
    int notLeafStart = (int) Math.floor((array.length)/2)-1;
    for (int i = notLeafStart; i >= 0 ; i--) {
      adjust(array, i, array.length);
    }
  }


  /**
   *
   * @param array
   * @param start
   * @param len
   */
  public void adjust(int[] array, int start, int len) {
    int k = start;
    int left = 2*k+1;
    int right = left+1;
    if(len > left && array[left] > array[k]) {
      k = left;
    }
    if(len> right && array[right] > array[k]) {
      k = right;
    }
    if(array[start] < array[k]) {
      swap(array, start, k);
      adjust(array, k, len);
    }
  }

  private void swap(int[] array, int x, int y) {
    int p = array[x];
    array[x] = array[y];
    array[y] = p;
  }
}
