package Generice;

public class Juice extends Liquid{
    public Juice(int temperature, String colour) {
        super(temperature, colour);
    }
    @Override
    public String toString() {
        return "Juice{" +
                "temperature=" + super.getTemperature() +
                ", colour='" + super.getColour() + '\'' +
                '}';
    }
}
