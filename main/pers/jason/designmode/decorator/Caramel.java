package pers.jason.designmode.decorator;

/**
 * @author Jason
 * @date 2021/9/20 23:12
 * @description 佐料：焦糖
 */
public class Caramel extends Condiment {

  private Beverage beverage;

  public Caramel(Beverage beverage, int part) {
    this.beverage = beverage;
    p = part;
  }

  @Override
  public String getDescription() {
    return "焦糖";
  }

  @Override
  public double cost() {
    return beverage.cost() + (p * 3);
  }
}
