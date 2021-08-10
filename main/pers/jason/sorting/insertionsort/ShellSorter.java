package pers.jason.sorting.insertionsort;

import pers.jason.sorting.Sorter;

public class ShellSorter implements Sorter {

  @Override
  public int[] sort(int[] array) {
    int[] increArray = hibbardHillIncremental(array.length);
    for(int i=0;i<increArray.length;i++) {
      int incre = increArray[i];
      for(int j=0;j<incre;j++) {
        insertSort(array, j, incre);
      }
    }
    return array;
  }

  private void insertSort(int[] array, int begin, int incre) {
    for(int i=begin+incre;i<array.length;i+=incre) {
      int j;
      for(j=begin;j<i;j+=incre) {
        if(array[j] > array[i]) {
          break;
        }
      }
      int p = array[i];
      for(int z=i;z>j;z-=incre) {
        array[z] = array[z-incre];
      }
      array[j] = p;
    }
  }

  /**
   * hibbard增量序列 (2^k)-1
   * 最坏时间复杂度为O(N(3/2))；平均时间复杂度约为O(N^(5/4))
   * 获取希尔增量序列，需要互为质数，且最小必须是1
   * @return
   */
  private int[] hibbardHillIncremental(int len) {
    int max = (len == 1) ? 1: (int) Math.floor(Math.log((len/2)+1)/Math.log(2));
    int[] array = new int[max];
    for(int i=max;i>=1;i--) {
      array[max-i]=(2<<(i-1)) - 1;
    }
    return array;
  }

  private int[] simpleHillIncremental(int len) {
    return new int[]{7,5,3,1};
  }

  /**
   * Sedgewick增量序列
   */
  private int[] sedgewickHillIncremental(int len) {
    return null;
  }

}
