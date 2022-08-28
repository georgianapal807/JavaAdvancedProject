package examples;

public class Truck extends Vehicle{
    @Override
    public String getIdentity(final String vehicle) {
        return null;
    }

    @Override
    public String getIdentity() {
        return message + "Truck";
    }
}
