package grocery;

public enum Grocery {
    TV(1200),
    FRIDGE(1000),
    WASHING_MACHINE(1500),
    ESPRESSOR(500),
    ;

    private final int price;

    Grocery(final int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
