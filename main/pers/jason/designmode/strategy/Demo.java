package pers.jason.designmode.strategy;

/**
 * @author Jason
 * @date 2021/9/20 23:57
 * @description
 */
public class Demo {

  public static void main(String[] args) {
    StrategyContext context = new StrategyContext(new AirplaneTravelStrategy("上海", "北京"));
    context.travel();

    context = new StrategyContext(new TrainTravelStrategy("上海", "深圳"));
    context.travel();
  }
}
