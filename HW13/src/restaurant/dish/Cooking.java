package restaurant.dish;

import java.util.HashMap;

public class Cooking {
    private HashMap<TitleDish, Ingredients[]> cooking = new HashMap<>();

    public void addDish(TitleDish titleDish, Ingredients[] ingredients) {
        cooking.put(titleDish, ingredients);
    }

    public HashMap<TitleDish, Ingredients[]> getCooking() {
        return cooking;
    }
}
