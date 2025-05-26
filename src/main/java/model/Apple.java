package model;

import static model.constants.Colour.RED_APPLES;
import static model.constants.Discount.DISCOUNT_FOR_RED_APPLES;


public class Apple extends Food implements Discountable {
    private String colour; //цвет яблок

        public Apple(int amount, double price, String colour) { // конструктор с параметрами
            super(amount, price, true);
            this.colour=colour;
        }
    @Override
    public double getDiscount() { //расчет скидки
        if (colour==RED_APPLES) {
            return DISCOUNT_FOR_RED_APPLES;
            }else {
                return 0;
            }
    }
}
