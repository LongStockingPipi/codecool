package pers.jason.sorting.insertionsort;

import pers.jason.sorting.Sorter;

public class ShellSorter implements Sorter {

  @Override
  public int[] sort(int[] array) {
    int len = array.length;
    int[] incre = hillIncremental(len);
    for(int i=0;i<incre.length;i++) {
      System.out.print(incre[i] + " ");
    }
    return new int[0];
  }

  /**
   * 获取希尔增量序列，需要互为质数，且最小必须是1
   * @return
   */
  public int[] hillIncremental(int len) {
    int max = (len == 1) ? 1: (int) Math.floor(Math.log((len/2)+1)/Math.log(2));
    int[] array = new int[max];
    for(int i=max;i>=1;i--) {
      array[max-i]=(2<<(i-1)) - 1;
    }
    return array;
  }

}
