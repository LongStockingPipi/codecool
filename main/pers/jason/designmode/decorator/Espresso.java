package pers.jason.designmode.decorator;

/**
 * @author Jason
 * @date 2021/9/20 23:10
 * @description 浓缩咖啡
 */
public class Espresso extends Beverage {

  Size size;

  public Espresso(Size size) {
    description = "浓缩咖啡";
    this.size = size;
  }

  @Override
  public double cost() {
    if(size.equals(Size.LARGE)) {
      return 16;
    } else if(size.equals(Size.MEDIUM)) {
      return 14;
    } else {
      return 12;
    }
  }
}
