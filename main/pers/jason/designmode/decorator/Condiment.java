package pers.jason.designmode.decorator;

/**
 * @author Jason
 * @date 2021/9/20 23:08
 * @description
 */
public abstract class Condiment extends Beverage{

  int p = 1;

  @Override
  public abstract String getDescription();

  public int part() {
    return p;
  }
}
