package pers.jason.designmode.template;

/**
 * @author Jason
 * @date 2021/9/21 0:46
 * @description
 */
public class TeaDrinks extends DrinksTemplate {
  @Override
  void addIngredients() {
    System.out.println("将茶叶倒入水中");
  }

  @Override
  void addCondiments() {
    System.out.println("向茶中添加柠檬汁");
  }
}
