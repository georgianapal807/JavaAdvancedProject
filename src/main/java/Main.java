import Animal.Cat;
import Animal.Dog;
import Movies.Studio;
import Recap.Pizza;
import examples.Bike;
import examples.Car;
import examples.Truck;
import examples.Vehicle;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //Example for encapsulation
        //cat.setA(2);
        //System.out.println(cat.getA());
        cat.eat();
        Dog dog = new Dog();
        dog.eat();
        // cat.makeSound();
        // dog.makeSound();
        //cat.setA(2);
        System.out.println("------------------------------------");

//Pentru pachetul de Vehicle
        Vehicle bike = new Bike();
        System.out.println(bike.getIdentity("MountainBike"));

        Vehicle car = new Car();
        System.out.println(car.getIdentity());

        Vehicle truck = new Truck();
        System.out.println(truck.getIdentity());

        System.out.println("------------------------------------");
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = bike;
        vehicles[1] = car;
        vehicles[2] = truck;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getIdentity());
        }
        System.out.println("------------------------------------");
        Studio studio = new Studio();
        studio.makeMovies();

        System.out.println("------------------------------------");
        Pizza pizza = new Pizza();
        pizza.setIngredients(new String[]{"dough", "salami", "onions"});
        pizza.mixIngredients();
    }
}

