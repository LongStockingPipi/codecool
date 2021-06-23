package pers.jason.jvm.ClassLoading;

/**
 * @author Jason
 * @date 2021/6/16 22:51
 * @description
 */
public class SubClass extends SuperClass {

  static final String value = "sub class value";

  static {
    System.out.println("sub class init ...");
  }

}
