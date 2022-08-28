package examples;

public class Car extends Vehicle {
    @Override
    public String getIdentity(final String vehicle) {
        return null;
    }

    @Override
    public String getIdentity() {
        return message + "Car";
    }
}
