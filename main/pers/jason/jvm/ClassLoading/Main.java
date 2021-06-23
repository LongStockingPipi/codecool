package pers.jason.jvm.ClassLoading;

/**
 * @author Jason
 * @date 2021/6/16 22:53
 * @description
 */
public class Main {

  public static void main(String[] args) {
    test3();
  }

  private static void test1() {
    System.out.println(SubClass.name);
  }

  private static void test2() {
    System.out.println(SubClass.value);
  }

  private static void test3() {
    SubClass[] array = new SubClass[2];
    System.out.println(array.length);
  }

}
