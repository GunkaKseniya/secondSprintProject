import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
                Meat meat = new Meat(5, 100); //Мясо в количестве 5 кг по цене 100 рублей за кг
                Apple redApples = new Apple(10, 50, Colour.RED_APPLES); //Яблоки красные в количестве 10 кг по цене 50 рублей
                Apple greenApples = new Apple(8, 60, Colour.GREEN_APPLES); //Яблоки зелёные в количестве 8 кг по цене 60 рублей

        Food[] objects = {meat, redApples, greenApples};

        ShoppingCart shoppingCart = new ShoppingCart(objects);

                System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalSumWithoutDiscount());
                System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getTotalSumWithDiscount());
                System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getVegetarianProductTotalSumWithoutDiscount());
            }
        }
