package restaurant.dish;

public class TitleDish {
    private String title;

    public TitleDish(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
