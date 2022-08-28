package Animal;

public abstract class Animal {

    protected int expectedLifeInYears;

    public Animal() {
        expectedLifeInYears = 0;
        System.out.println("I am an animal");
    }

    public void eat() {
        System.out.println("I am eating food");
    }

    abstract void makeSound(); //aceasta abstractizare ne ajuta sa ne oblige in subclasele care mostenesc
    //clasa de Animal.Animal doar ca fiecare va face un sunet diferit.
}
//clasele abstracte nu pot fi instantiate dar pot fi mostenite si clasele mici care le mostenesc se pot folosi