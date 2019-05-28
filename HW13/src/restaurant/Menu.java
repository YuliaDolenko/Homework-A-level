package restaurant;

import restaurant.dish.TitleDish;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<TitleDish> titleDishes = new ArrayList<>();

    public void addDish(TitleDish dish) {
        titleDishes.add(dish);
    }

    public TitleDish getDishByMenuNumber(int menuPoint) {
        return titleDishes.get(menuPoint - 1);
    }

    public List<TitleDish> getDishes() {
        return titleDishes;
    }

    @Override
    public String toString() {
        String conclusion = "";
        for (int i = 0; i < titleDishes.size(); i++) {
            conclusion += (i + 1) + ". " + titleDishes.get(i).toString() + "\n";
        }
        return conclusion;
    }
}
