package pers.jason.designmode.strategy;

/**
 * @author Jason
 * @date 2021/9/20 23:49
 * @description
 */
public abstract class TravelStrategy {

  String from;

  String to;

  public TravelStrategy(String form, String to) {
    this.from = form;
    this.to = to;
  }

  public abstract void travel();

}
