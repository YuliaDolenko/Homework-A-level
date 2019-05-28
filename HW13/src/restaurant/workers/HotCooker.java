package restaurant.workers;

import restaurant.dish.Dish;
import restaurant.dish.Ingredients;

public class HotCooker extends Cooker implements Cook {

    public HotCooker(String name) {
        super(name, Ingredients.DOUGH, Ingredients.MEAT, Ingredients.POTATO, Ingredients.FILLING);
    }

    @Override
    public void addProduct(Dish dish, Ingredients ingredients) {
        dish.addIngredients(ingredients);
    }
}