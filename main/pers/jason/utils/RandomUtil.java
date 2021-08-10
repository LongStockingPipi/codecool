package pers.jason.utils;

import java.util.Random;

/**
 * @author Jason
 * @date 2021/8/10 23:25
 * @description
 */
public class RandomUtil {

  public static int[] createRandomIntArray(int count, int max, int min) {
    int[] array = new int[count];
    Random random = new Random();
    for(int i=0;i<count;i++) {
      array[i] = random.nextInt(max)%(max-min+1) + min;
    }
    return array;
  }

  public static void main(String[] args) {
    PrintUtil.printIntArray(createRandomIntArray(1000, 1000, 0));
  }

}
