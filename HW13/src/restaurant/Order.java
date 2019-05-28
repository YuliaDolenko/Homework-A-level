package restaurant;

import restaurant.dish.TitleDish;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<TitleDish> titleDishes = new ArrayList<>();

    public void addNameOfDish(TitleDish titleDish) {
        titleDishes.add(titleDish);
    }

    public List<TitleDish> getTitleDish() {
        return titleDishes;
    }
}
