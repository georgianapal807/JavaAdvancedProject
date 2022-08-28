package Recap;

public abstract class Food {

    private String[] ingredients;

    public Food() {
        System.out.println("All foods will be prepared");
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public abstract void mixIngredients();
}
