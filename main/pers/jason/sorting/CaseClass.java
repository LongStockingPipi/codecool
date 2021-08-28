package pers.jason.sorting;

import pers.jason.sorting.exchangesort.BubbleSorter;
import pers.jason.sorting.exchangesort.QuickSorter;
import pers.jason.sorting.insertionsort.DirectInsertionSorter;
import pers.jason.sorting.insertionsort.ShellSorter;
import pers.jason.sorting.selectionsort.HeapSorter;
import pers.jason.sorting.selectionsort.SimpleSelectionSort;
import pers.jason.utils.PrintUtil;
import pers.jason.utils.RandomUtil;

/**
 * @author Jason
 * @date 2021/8/4 23:10
 * @description
 */
public class CaseClass {

  static final int count = 10000;

  static final int max = 10800;

  static final int min = 0;

  public static void main(String[] args) {
    //todo: 最大增量应该大于长度/2还是小于len/2 确认增量序列的几种算法
    int[] array1 = RandomUtil.createRandomIntArray(count, max, min);
    int[] array2 = RandomUtil.createRandomIntArray(count, max, min);
    int[] array3 = RandomUtil.createRandomIntArray(count, max, min);
    int[] array4 = RandomUtil.createRandomIntArray(count, max, min);
    int[] array5 = RandomUtil.createRandomIntArray(count, max, min);
    int[] array6 = RandomUtil.createRandomIntArray(count, max, min);

    Sorter shellSorter = new ShellSorter();
    Sorter directInsertionSorter = new DirectInsertionSorter();
    Sorter quickSorter = new QuickSorter();
    Sorter bubbleSorter = new BubbleSorter();
    Sorter heapSorter = new HeapSorter();
    Sorter simpleSelectionSorter = new SimpleSelectionSort();

    long now1 = System.currentTimeMillis();
    shellSorter.sort(array1);
    System.out.println("希尔排序处理" + count + "个随机数耗时：" + (System.currentTimeMillis()-now1));

    long now2 = System.currentTimeMillis();
    directInsertionSorter.sort(array2);
    System.out.println("直插排序处理" + count + "个随机数耗时：" + (System.currentTimeMillis()-now2));

    long now3 = System.currentTimeMillis();
    quickSorter.sort(array3);
    System.out.println("快速排序处理" + count + "个随机数耗时：" + (System.currentTimeMillis()-now3));

    long now4 = System.currentTimeMillis();
    bubbleSorter.sort(array4);
    System.out.println("冒泡排序处理" + count + "个随机数耗时：" + (System.currentTimeMillis()-now4));

    long now5 = System.currentTimeMillis();
    heapSorter.sort(array5);
    System.out.println("堆排序处理" + count + "个随机数耗时：" + (System.currentTimeMillis()-now5));

    long now6 = System.currentTimeMillis();
    simpleSelectionSorter.sort(array6);
    System.out.println("简单选择排序处理" + count + "个随机数耗时：" + (System.currentTimeMillis()-now6));
  }

}
