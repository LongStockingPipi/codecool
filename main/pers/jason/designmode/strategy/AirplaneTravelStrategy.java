package pers.jason.designmode.strategy;

/**
 * @author Jason
 * @date 2021/9/20 23:54
 * @description
 */
public class AirplaneTravelStrategy extends TravelStrategy {

  public AirplaneTravelStrategy(String from, String to) {
    super(from, to);
  }

  @Override
  public void travel() {
    System.out.println("从" + from + "坐飞机到" + to);
  }
}
