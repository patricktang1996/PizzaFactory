public class FruitPizza extends Pizza{
    private String ingredients;

    public FruitPizza() {
    }

    public FruitPizza(String name, int price, int size, String ingredients) {
        super(name, price, size);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String showPizza() {
        return super.showPizza()+"\nAll ingredients："+ingredients+"\n";
    }
}
