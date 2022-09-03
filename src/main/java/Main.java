import Animal.Cat;
import Animal.Dog;
import Movies.Studio;
import Recap.Food;
import Recap.Pizza;
import examples.Bike;
import examples.Car;
import examples.Truck;
import examples.Vehicle;

import java.util.*;

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

        //clasa abstracta
        Food food = new Food() {
            @Override
            public void mixIngredients() {
                System.out.println("Mixing ingredients");
            }
        };

        //food.mixIngredients();
        //System.out.println(Coffee.getByValue("irish").getPrice());

        Coffee latte = new Coffee();
        latte.setName("latte");
        latte.setPrice(5);

        Coffee irish = new Coffee();
        irish.setName("irish");
        irish.setPrice(10);

        Coffee[] coffees = new Coffee[]{latte, irish};

        for (Coffee coffee : coffees) {
            if ("irish".equals(coffee.getName())) {
                System.out.println(coffee.getPrice());
            }
        }

        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Sorin");
        names.add("Alexandra");
        names.add("Lucinia");

        names.remove("Alexandra");

        System.out.println(names.isEmpty());

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            if (name.equals("Sorin")) {
                System.out.println("Te-am gasit!");
            }
        }

        if (names.contains("Sorin")) {
            System.out.println("Te-am gasit!");
        }

        String[] namesInArray = names.toArray(new String[0]); //din lista in array
        String[] namesAsArray = new String[]{"Sorin", "Alexandra"};
        List<String> namesAsList = Arrays.asList(namesAsArray); //din array in lista
        System.out.println("---------------------------------------------------------");
        names.addAll(namesAsList);
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.get(names.indexOf("Sorin")));

        System.out.println("---------------------------------------------------------");

        Person person1 = new Person();
        person1.setLastName("Cernescu");
        person1.setFirstName("Stefan");

        Person person2 = new Person();
        person2.setFirstName("Alex");
        person2.setLastName("Ene");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        for (Person person : people) {
            if (person.getFirstName().equals("Stefan")) {
                System.out.println(person.getLastName());
            }
        }

        Grocery backery = new Backery();
        backery.setName("CupCake");
        backery.setPrice(5);

        Grocery cola = new Drink();
        cola.setName("Coca Cola");
        cola.setPrice(10);

        List<Grocery> groceries = new ArrayList<>();
        groceries.add(backery);
        groceries.add(cola);


        System.out.println("--------------");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("--------------");
        names.removeAll(List.of("Alexandra", "Alex"));
        for (String name : names) {
            System.out.println(name);
        }

        String[] array = new String[5];
        List<String> list = new LinkedList<>();
        System.out.println("--------------");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(3);
        numbers.add(2);
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("--------------");
        //    Set<String> setNames = new HashSet<>(); nu pastreaza ordinea la inserare
        Set<String> setNames = new LinkedHashSet<>(); //pastreaza ordinea la inserare
        setNames.add("George");
        setNames.add("Andrei");
        setNames.add("Alexandra");
        setNames.add("Ramon");
        for (String name : setNames) {
            System.out.println(name + " " + name.hashCode());
        }
        System.out.println("--------------");
        int x = 11;
        List<Integer> numere = List.of(1, 2, 2, 4, 1, 7, 5, 12);
        for (int i = 0; i < numere.size(); i++) {
            for (int j = i + 1; j < numere.size(); j++) {
                if (numere.get(i) + numere.get(j) == x) {
                    System.out.println("I have found the number");
                }
            }
        }

        //   numere.sort(Comparator.comparingInt(x2 -> x2));
        System.out.println("--------------");

        Set<Integer> foundNumbers = new HashSet<>();
        for (Integer number : numere) {
            if (foundNumbers.contains(number)) {
                System.out.println("I have found the number");
            } else {
                foundNumbers.add(x - number);
            }
        }

        System.out.println("--------------");

    }
}

