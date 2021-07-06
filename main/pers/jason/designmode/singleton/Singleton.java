package pers.jason.designmode.singleton;

public class Singleton {

  private Singleton() {}

  private volatile static Singleton singleton;

  public static Singleton getInstance() {
    if(null == singleton) {
      synchronized (Singleton.class) {
        if(null == singleton) {
          singleton = new Singleton();
        }
      }
    }
    return singleton;
  }

}
