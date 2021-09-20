package pers.jason.designmode.decorator;

/**
 * @author Jason
 * @date 2021/9/20 23:20
 * @description
 */
public class Milk extends Condiment {

  private Beverage beverage;

  public Milk(Beverage beverage, int part) {
    this.beverage = beverage;
    p = part;
  }

  @Override
  public String getDescription() {
    return "牛奶";
  }

  @Override
  public double cost() {
    return beverage.cost() + (1 * p);
  }
}
