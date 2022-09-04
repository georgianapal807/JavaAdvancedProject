public class CarEnum {

    private Model mode;
    private Integer year;
    private String color;

    public CarEnum(Model mode, Integer year, String color) {
        this.mode = mode;
        this.year = year;
        this.color = color;
    }

    public Model getMode() {
        return mode;
    }

    public void setMode(Model mode) {
        this.mode = mode;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mode=" + mode +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
