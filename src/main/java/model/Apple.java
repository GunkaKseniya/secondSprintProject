package model;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    private String colour; //цвет яблок

        public Apple(int amount, double price, String colour) { // конструктор с параметрами
            super(amount, price, true);
            this.colour=colour;
        }
    @Override
    public double getDiscount() { //расчет скидки
        if (colour=="red") {
            return Discount.DISCOUNT_FOR_RED_APPLES;
            }else {
                return 0;
            }
    }
}
