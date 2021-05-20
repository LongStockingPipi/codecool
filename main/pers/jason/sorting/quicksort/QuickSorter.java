package pers.jason.sorting.quicksort;

import pers.jason.sorting.Sorter;
import pers.jason.utils.PrintUtil;

public class QuickSorter implements Sorter {

  @Override
  public int[] sort(int[] array) {
    sort(array, 0, array.length-1);
    return array;
  }

  private void sort(int[] array, int left, int right) {
    if(left < right) {
      int min = divide(array, left, right);
      sort(array, left, min-1);
      sort(array, min+1, right);
    }
  }


  private int divide(int[] array, int left, int right) {
    int pivotKey = array[left];
    while(left < right) {
      while(left < right) {
        if(array[right] < pivotKey) {
          array[left] = array[right];
          break;
        }
        right--;
      }
      while(left < right) {
        if(array[left] > pivotKey) {
          array[right] = array[left];
          break;
        }
        left++;
      }
    }
    array[left] = pivotKey;
    return left;
  }

  public static void main(String[] args) {
    Sorter sorter = new QuickSorter();
    int[] array = new int[]{15, 3, 26, 19, 4, 1, 42, 7, 51, 22, 18, 49, 63, 8, 4, 11, 32};
    sorter.sort(array);
    PrintUtil.printIntArray(array);
  }

}
