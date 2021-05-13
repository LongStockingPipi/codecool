package com.example;

/**
 * @author Jason
 * @date 2021/5/12 23:16
 * @description
 */
public class Test {

  public static void main(String[] args) {
    int result = 0;
    int x = 1463847413;
    while(x != 0) {
      int p = x%10;
      if(result > 214748364 || (result == 214748364 && p > 7)) {

      }
      if(result < -214748364 || (result == -214748364 && p < -8)) {

      }

      result = result * 10 + p;
      x = x / 10;
    }
    System.out.println(result);
  }

}
