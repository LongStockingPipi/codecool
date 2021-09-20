package pers.jason.designmode.decorator;

/**
 * @author Jason
 * @date 2021/9/20 23:06
 * @description 饮料基类，其实是咖啡、佐料的基类
 */
public abstract class Beverage {



  String description = "Unknown Beverage";

  public String getDescription() {
    return this.description;
  }

  /**
   * 价格
   * @return
   */
  public abstract double cost();



  enum Size {

    LARGE,
    MEDIUM,
    SMALL;


  }
}
