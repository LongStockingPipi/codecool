package pers.jason.jvm;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jason
 * @date 2021/5/22 23:15
 * @description
 */
public class Monitor {

  public static void main(String[] args) {
    System.out.println("1");
    runIt();
  }

  private static void runIt() {
    System.out.println(1);

    runIt();
  }

}
