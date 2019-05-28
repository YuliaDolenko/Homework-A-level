package restaurant.workers;

import restaurant.dish.Dish;
import restaurant.dish.Ingredients;

public interface Cook {

    void addProduct(Dish dish, Ingredients ingredients);

}