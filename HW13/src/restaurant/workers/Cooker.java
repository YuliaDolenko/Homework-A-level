package restaurant.workers;

import restaurant.dish.Dish;
import restaurant.dish.Ingredients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cooker extends Person implements Cook {

    private final List<Ingredients> direction = new ArrayList<>();

    public Cooker(String name, Ingredients... ingredients) {
        super(name);
        direction.addAll(Arrays.asList(ingredients));
    }

    public boolean isHaveResponsibility(Ingredients ingredients) {
        for (Ingredients direction : this.direction) {
            if (ingredients.equals(direction)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addProduct(Dish dish, Ingredients ingredients) {

    }
}