package Generice;

public class Water extends Liquid{
    public Water(int temperature, String colour) {
        super(temperature, colour);
    }

    @Override
    public String toString() {
        return "Water{" +
                "temperature=" + super.getTemperature() +
                ", colour='" + super.getColour() + '\'' +
                '}';
    }
}
