package restaurant;

import restaurant.dish.Dish;
import restaurant.workers.Waiter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter("Matt");
        Menu menu = waiter.getMenu();
        System.out.println(menu);
        waiter.createOrder();
        List<Dish> dishes = waiter.getDish();
        for (Dish dish : dishes) {
            System.out.println("Ваш заказ: " + dish);
        }
    }
}
