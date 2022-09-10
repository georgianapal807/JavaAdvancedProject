package Generice;

public class Tea extends Liquid {
    public Tea(int temperature, String color) {
        super(temperature, color);
    }
    @Override
    public String toString() {
        return "Tea{" +
                "temperature=" + super.getTemperature() +
                ", colour='" + super.getColour() + '\'' +
                '}';
    }
}
