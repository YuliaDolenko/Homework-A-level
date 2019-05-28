package restaurant.dish;

public enum Ingredients {

    POTATO("картошка"),

    MEAT("мясо"),

    SAUCE("соус"),

    DOUGH("тесто"),

    FILLING("начинка"),

    SALAD("салат"),

    LEAD("свинец"),

    REFUELING("заправка"),

    CAKE("пирожене"),

    CREAM("крем"),

    FRUITS("фрукты"),

    FAT("сало"),

    HERRING("селедка"),

    CUCUMBERS("огурцы"),

    VODKA("водка"),

    PASTA("паста");

    private final String ingredients;

    Ingredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return this.ingredients;
    }


}
