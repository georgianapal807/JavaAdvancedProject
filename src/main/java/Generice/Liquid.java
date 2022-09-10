package Generice;

public abstract class Liquid {
    private int temperature;
    private String colour;

    public Liquid(int temperature, String colour) {
        this.temperature = temperature;
        this.colour = colour;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Liquid{" +
                "temperature=" + temperature +
                ", colour='" + colour + '\'' +
                '}';
    }
}
