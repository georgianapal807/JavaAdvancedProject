package examples;

public abstract class Vehicle {
    int numberOfWheels;
    boolean hasEngine;
    String message;

    public Vehicle() {
        numberOfWheels = 1;
        message = "This is a cool ";
    }

    public abstract String getIdentity(String vehicle);
    public abstract String getIdentity();
}
