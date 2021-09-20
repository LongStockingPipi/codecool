package pers.jason.designmode.decorator;

import static pers.jason.designmode.decorator.Beverage.Size.MEDIUM;

/**
 * @author Jason
 * @date 2021/9/20 23:21
 * @description
 */
public class Store {

  public static void main(String[] args) {
    Beverage beverage = new Espresso(MEDIUM); //中杯浓缩咖啡
    beverage = new Milk(beverage, 2);    //加双份牛奶
    beverage = new Caramel(beverage, 1); //加一份焦糖
    System.out.println("浓缩咖啡花费：" + beverage.cost());
  }


}
