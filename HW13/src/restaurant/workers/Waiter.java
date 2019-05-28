package restaurant.workers;

import restaurant.Menu;
import restaurant.Order;
import restaurant.dish.Dish;

import java.util.List;
import java.util.Scanner;

public class Waiter extends Person {

    private Order order;

    private СhiefCooker chief;

    private Menu menu;

    private List<Dish> dishes;

    public Waiter(String name) {
        super(name);
    }

    public Menu getMenu() {
        chief = new СhiefCooker("Анатолий");
        menu = chief.createMenu();
        return menu;
    }

    public List<Dish> getDish() {
        chief.setOrder(order);
        dishes = chief.getDishes();
        return dishes;
    }

    public void createOrder() {
        Scanner scanner = new Scanner(System.in);
        this.order = new Order();
        while (true) {
            String inputString = scanner.nextLine();
            int menuPoint;
            try {
                menuPoint = Integer.parseInt(inputString);
            } catch (NumberFormatException e) {
                System.out.println("Такого нет в меню!");
                continue;
            }
            if (menuPoint == 0) {
                break;
            } else if (isValidOrderData(menuPoint)) {
                order.addNameOfDish(menu.getDishByMenuNumber(menuPoint));
            } else {
                System.out.println("Такого нет в меню!");
            }
        }
    }

    private boolean isValidOrderData(int menuPoint) {
        if (menuPoint > menu.getDishes().size()) {
            return false;
        }
        if (menuPoint < 0) {
            return false;
        }
        return true;
    }

}