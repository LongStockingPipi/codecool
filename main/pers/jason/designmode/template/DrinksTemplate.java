package pers.jason.designmode.template;

/**
 * @author Jason
 * @date 2021/9/21 0:41
 * @description 抽象模板方法
 */
public abstract class DrinksTemplate {

  public final void makeDrink() {
    boil();
    addIngredients();
    decant();
    addCondiments();
  }

  private void boil() {
    System.out.println("将水煮沸");
  }

  /**
   * 添加原料
   */
  abstract void addIngredients();

  private void decant() {
    System.out.println("将饮料倒入杯中");
  }

  /**
   * 添加佐料
   */
  abstract void addCondiments();


}
