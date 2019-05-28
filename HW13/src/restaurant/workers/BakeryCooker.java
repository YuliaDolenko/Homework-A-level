package restaurant.workers;

import restaurant.dish.Dish;
import restaurant.dish.Ingredients;

public class BakeryCooker extends Cooker implements Cook {

    public BakeryCooker(String name) {
        super(name, Ingredients.CAKE, Ingredients.CREAM, Ingredients.FRUITS);
    }

    @Override
    public void addProduct(Dish dish, Ingredients ingredients) {
        dish.addIngredients(ingredients);
    }
}