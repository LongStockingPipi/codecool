package pers.jason.designmode.observer.userdefined;

/**
 * @author Jason
 * @date 2021/8/24 23:09
 * @description 主题接口
 */
public interface Subject {

  /**
   * 注册观察者
   * @param observer
   */
  void registerObserver(Observer observer);

  /**
   * 观察者取消订阅
   * @param observer
   */
  void removeObserver(Observer observer);

  /**
   * 通知
   */
  void notifyObservers();

}
