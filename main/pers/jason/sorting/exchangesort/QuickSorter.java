package pers.jason.sorting.exchangesort;

import pers.jason.sorting.Sorter;
import pers.jason.utils.PrintUtil;

/**
 * @author Jason
 * @date 2021/8/10 23:42
 * @description
 */
public class QuickSorter implements Sorter {

  @Override
  public int[] sort(int[] array) {
    quickSort(array, 0, array.length-1);
    return array;
  }

  private void quickSort(int[] array, int start, int end) {
    if(end > start) {
      int p = array[start];
      int i=start;
      int j=end;
      while(i<j) {
        for(;i<j;j--) {
          if(array[j]<p) {
            array[i] = array[j];
            break;
          }
        }
        for(;i<j;i++) {
          if(array[i]>p) {
            array[j]=array[i];
            break;
          }
        }
      }
      array[i] = p;

      quickSort(array, start, i-1);
      quickSort(array, i+1, end);
    }
  }



  public static void main(String[] args) {
    PrintUtil.printIntArray((new QuickSorter()).sort(new int[]{34,11,2,76,19,24,7,16,26,43,13,5,99,61,1,27,3}));
  }

}
