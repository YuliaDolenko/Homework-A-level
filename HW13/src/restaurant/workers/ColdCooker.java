package restaurant.workers;

import restaurant.dish.Dish;
import restaurant.dish.Ingredients;

public class ColdCooker extends Cooker implements Cook {

    public ColdCooker(String name) {
        super(name, Ingredients.CUCUMBERS, Ingredients.FAT, Ingredients.HERRING,
                Ingredients.PASTA, Ingredients.VODKA, Ingredients.LEAD, Ingredients.REFUELING,
                Ingredients.SALAD, Ingredients.SAUCE);
    }

    @Override
    public void addProduct(Dish dish, Ingredients ingredients) {
        dish.addIngredients(ingredients);
    }
}