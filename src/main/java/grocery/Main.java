package grocery;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Grocery> groceryList = new HashSet<>();
        groceryList.add(Grocery.FRIDGE);
        groceryList.add(Grocery.TV);
        groceryList.add(Grocery.ESPRESSOR);
        groceryList.add(Grocery.WASHING_MACHINE);
        groceryList.add(Grocery.ESPRESSOR);

        int total = 0;

        for (Grocery grocery : groceryList) {
            total += grocery.getPrice();
        }
        System.out.println("Am cheltuit " + total);

    }
}
