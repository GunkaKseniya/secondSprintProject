package service;

import model.Food;

public class ShoppingCart {
    private Food[] objects; //массив элементов из объектов

    public ShoppingCart(Food[] objects) {
        this.objects = objects;
    }

    public double getTotalSumWithoutDiscount() { //метод подсчета общей суммы товаров в корзине без скидки
        double sum = 0.0;
        for (int i=0;i<objects.length; i++) {
            sum = sum+(objects[i].getPrice() * objects[i].getAmount());
        }
        return sum;
    }

    public double getTotalSumWithDiscount() {  //метод подсчета общей суммы товаров в корзине со скидкой
        double sum=0.0;
        for (int i=0;i<objects.length; i++) {
            double discount = objects[i].getDiscount();
            double priceWithDiscount = objects[i].getPrice() * (1 - discount);
            sum += priceWithDiscount * objects[i].getAmount();
        }
        return sum;
    }

    public double getVegetarianProductTotalSumWithoutDiscount(){ //метод подсчета общей суммы всех вегетарианских продуктов в корзине без скидки
        double sum=0.0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].isVegetarian()) {
                sum = sum+(objects[i].getPrice() * objects[i].getAmount());
            }
        }
        return sum;
    }
}

