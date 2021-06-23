package pers.jason.jvm.ClassLoading;

/**
 * @author Jason
 * @date 2021/6/16 22:51
 * @description
 */
public class SuperClass {

  static String name = "SUPERCLASS";

  static {
    System.out.println("super class init ...");
  }

}
