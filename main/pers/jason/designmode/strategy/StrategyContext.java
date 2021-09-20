package pers.jason.designmode.strategy;

/**
 * @author Jason
 * @date 2021/9/20 23:56
 * @description
 */
public class StrategyContext {

  private TravelStrategy travelStrategy;

  public StrategyContext(TravelStrategy travelStrategy) {
    this.travelStrategy = travelStrategy;
  }

  public void travel() {
    this.travelStrategy.travel();
  }
}
