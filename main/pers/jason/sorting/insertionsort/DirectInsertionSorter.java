package pers.jason.sorting.insertionsort;

import pers.jason.sorting.Sorter;

/**
 * @author Jason
 * @date 2021/8/4 22:49
 * @description 直接插入排序，时间复杂度O(n^2)
 */
public class DirectInsertionSorter implements Sorter {

  @Override
  public int[] sort(int[] array) {
    for(int i=1;i<array.length;i++) {

      int j; //找到比[i]大的坐标
      for(j=0;j<i;j++) {
        if(array[j]>array[i]) {
          break;
        }
      }

      int p = array[i];
      for(int z=i;z>j;z--) {
        array[z] = array[z-1];
      }
      array[j] = p;

    }

    return array;
  }

}
