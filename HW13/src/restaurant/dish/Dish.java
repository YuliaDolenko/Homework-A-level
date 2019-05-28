package restaurant.dish;

import java.util.ArrayList;
import java.util.List;

public class Dish {
        private String title;

        private List<Ingredients> ingredient;

        public Dish(String title) {
            this.title = title;
            ingredient = new ArrayList<>();
        }

        public void addIngredients(Ingredients ingredients) {
            ingredient.add(ingredients);
        }

        @Override
        public String toString() {
            String conclusion = "";
            for (Ingredients ingredients : ingredient) {
                conclusion += ingredients.getIngredients() + " ";
            }
            return title + ": " + conclusion;
        }

}
