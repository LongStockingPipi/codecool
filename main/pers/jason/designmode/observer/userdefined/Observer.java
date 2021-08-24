package pers.jason.designmode.observer.userdefined;

/**
 * @author Jason
 * @date 2021/8/24 23:06
 * @description 观察者接口
 */
public interface Observer {

  /**
   * 观察者标准接口，更新状态
   * @param temp 温度
   * @param humidity 湿度
   * @param pressure 气压
   */
  void update(float temp, float humidity, float pressure);

}
