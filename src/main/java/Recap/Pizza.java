package Recap;

public class Pizza extends Food {
    @Override
    public void mixIngredients() {
        System.out.println("Mixing pizza ingredients");
        for (int i = 0; i < getIngredients().length; i++) {
            System.out.println(getIngredients()[i]);
        }
    }
}
