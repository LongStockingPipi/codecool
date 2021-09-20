package pers.jason.designmode.strategy;

/**
 * @author Jason
 * @date 2021/9/20 23:52
 * @description
 */
public class TrainTravelStrategy extends TravelStrategy {

  public TrainTravelStrategy(String from, String to) {
    super(from, to);
  }

  @Override
  public void travel() {
    System.out.println("从" + from + "坐火车到" + to);
  }
}
