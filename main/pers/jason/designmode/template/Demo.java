package pers.jason.designmode.template;

/**
 * @author Jason
 * @date 2021/9/21 0:47
 * @description
 */
public class Demo {

  public static void main(String[] args) {
    DrinksTemplate coffeeTemplate = new CoffeeDrinks();
    DrinksTemplate teaTemplate = new TeaDrinks();

    coffeeTemplate.makeDrink();
    teaTemplate.makeDrink();
  }
}
