package pers.jason.designmode.template;

/**
 * @author Jason
 * @date 2021/9/21 0:45
 * @description
 */
public class CoffeeDrinks extends DrinksTemplate {
  @Override
  void addIngredients() {
    System.out.println("将研磨后的咖啡倒入水中");
  }

  @Override
  void addCondiments() {
    System.out.println("向咖啡中添加牛奶");
  }
}
