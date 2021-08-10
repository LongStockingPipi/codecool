package pers.jason.sorting;

import pers.jason.sorting.exchangesort.BubbleSorter;
import pers.jason.sorting.exchangesort.QuickSorter;
import pers.jason.sorting.insertionsort.DirectInsertionSorter;
import pers.jason.sorting.insertionsort.ShellSorter;
import pers.jason.utils.RandomUtil;

/**
 * @author Jason
 * @date 2021/8/4 23:10
 * @description
 */
public class CaseClass {

  public static void main(String[] args) {
    //todo: 最大增量应该大于长度/2还是小于len/2 确认增量序列的几种算法
    int[] array1 = RandomUtil.createRandomIntArray(10000, 10000, 0);
    int[] array2 = RandomUtil.createRandomIntArray(10000, 10000, 0);
    int[] array3 = RandomUtil.createRandomIntArray(10000, 10000, 0);
    int[] array4 = RandomUtil.createRandomIntArray(10000, 10000, 0);
    Sorter shellSorter = new ShellSorter();
    Sorter directInsertionSorter = new DirectInsertionSorter();
    Sorter quickSorter = new QuickSorter();
    Sorter bubbleSorter = new BubbleSorter();
    long now1 = System.currentTimeMillis();
    shellSorter.sort(array1);
    System.out.println("希尔排序处理10000个随机数耗时：" + (System.currentTimeMillis()-now1));

    long now2 = System.currentTimeMillis();
    directInsertionSorter.sort(array2);
    System.out.println("直插排序处理10000个随机数耗时：" + (System.currentTimeMillis()-now2));

    long now3 = System.currentTimeMillis();
    quickSorter.sort(array3);
    System.out.println("快速排序处理10000个随机数耗时：" + (System.currentTimeMillis()-now3));

    long now4 = System.currentTimeMillis();
    bubbleSorter.sort(array4);
    System.out.println("冒泡排序处理10000个随机数耗时：" + (System.currentTimeMillis()-now4));
  }

}
