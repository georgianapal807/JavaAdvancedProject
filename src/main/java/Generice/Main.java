package Generice;

public class Main {
    public static void main(String[] args) {

        Cup<Tea> firstCup = new Cup<>();
        firstCup.setLiquid(new Tea(32, "purple"));
        firstCup.drink();

        Cup<Water> secondCup = new Cup<>();
        secondCup.setLiquid(new Water(38, "transparent"));
        secondCup.drink();

        Cup<Juice> thirdCup = new Cup<>();
        thirdCup.setLiquid(new Juice(15, "orange"));
        thirdCup.drink();
    }
}
