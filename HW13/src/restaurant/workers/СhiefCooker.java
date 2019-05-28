package restaurant.workers;

import restaurant.Menu;
import restaurant.Order;
import restaurant.dish.Cooking;
import restaurant.dish.Dish;
import restaurant.dish.Ingredients;
import restaurant.dish.TitleDish;

import java.util.ArrayList;
import java.util.List;

public class СhiefCooker extends Person {

    private Order order;

    private Cooking cooking;

    private List<Dish> dishes;

    private List<Cooker> cookers;

    public СhiefCooker(String name) {
        super(name);
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<Dish> getDishes() {
        dishes = new ArrayList<>();
        for (TitleDish titleDish : order.getTitleDish()) {
            try {
                Dish tmpDish = createDish(titleDish);
                dishes.add(tmpDish);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return dishes;
    }

    private Dish createDish(TitleDish titleDish) {
        Dish dish = new Dish(titleDish.getTitle());
        cookers = new ArrayList<>();
        cookers.add(new ColdCooker("Анатолий"));
        cookers.add(new HotCooker("Алексей"));
        cookers.add(new BakeryCooker("Владимир"));
        for (Ingredients ingredients : cooking.getCooking().get(titleDish)) {
            addProductByCooker(cookers, dish, ingredients);
        }
        return dish;
    }

    private void addProductByCooker(List<Cooker> cookers, Dish dish, Ingredients ingredients) {
        for (Cooker cooker : cookers) {
            if (cooker.isHaveResponsibility(ingredients)) {
                cooker.addProduct(dish, ingredients);
                return;
            }
        }
    }

    public Menu createMenu() {
        createRecipes();
        Menu menu = new Menu();
        for (TitleDish titleDish : cooking.getCooking().keySet()) {
            menu.addDish(titleDish);
        }
        return menu;
    }

    public void createRecipes() {
        cooking = new Cooking();
        TitleDish nameDish1 = new TitleDish("Mяско с картохой под соусом анане");
        cooking.addDish(nameDish1, new Ingredients[]{Ingredients.POTATO, Ingredients.MEAT, Ingredients.SAUCE});
        TitleDish nameDish2 = new TitleDish("Пицца-заебицца");
        cooking.addDish(nameDish2, new Ingredients[]{Ingredients.DOUGH, Ingredients.FILLING, Ingredients.SAUCE});
        TitleDish nameDish3 = new TitleDish("Паста под зуб(зубной соус)");
        cooking.addDish(nameDish3, new Ingredients[]{ Ingredients.PASTA, Ingredients.SAUCE});
        TitleDish nameDish4 = new TitleDish("Греческий салат(под свинцом)");
        cooking.addDish(nameDish4,new Ingredients[]{ Ingredients.SALAD, Ingredients.LEAD, Ingredients.REFUELING});
        TitleDish nameDish5 = new TitleDish("Серожене пирожене");
        cooking.addDish(nameDish5,new Ingredients[]{ Ingredients.CAKE, Ingredients.CREAM, Ingredients.FRUITS});
        TitleDish nameDish6 = new TitleDish("Водочная тарелка");
        cooking.addDish(nameDish6, new Ingredients[] {Ingredients.FAT, Ingredients.HERRING, Ingredients.CUCUMBERS, Ingredients.VODKA});
    }

}