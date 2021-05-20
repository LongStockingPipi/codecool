package pers.jason.sorting.bubblesort;

import pers.jason.sorting.Sorter;
import pers.jason.utils.PrintUtil;

/**
 * @author Jason
 * @date 2021/5/20 20:39
 * @description
 */
public class BubbleSorter implements Sorter {

  @Override
  public int[] sort(int[] array) {
    int len = array.length;
    for(int i=0; i<len; i++) {
      for(int j=0; j<len-i-1; j++) {
        if(array[j] > array[j+1]) {
          int tmp = array[j];
          array[j] = array[j+1];
          array[j+1] = tmp;
        }
      }
    }
    return array;
  }

  public static void main(String[] args) {
    int[] array = new int[]{29, 13, 16, 57, 44, 12, 19, 8, 21, 38, 96, 55, 34, 7, 63};
    Sorter sorter = new BubbleSorter();
    PrintUtil.printIntArray(sorter.sort(array));
  }
}
