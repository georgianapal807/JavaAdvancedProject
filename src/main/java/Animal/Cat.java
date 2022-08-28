package Animal;

import Animal.Animal;

public class Cat extends Animal {

    private int a; //incapsuleaza primitiva a
    //private int expectedLifeInYears; this is a protected member from Animal.Animal class

    public Cat() {
        System.out.println("I am cat");
    }

    @Override
    void makeSound() {
        System.out.println("Miau Miau");
    }

    public int getA() {
        return a;
    }

    public void setA(final int a) {
        if (a < 0) {
            throw new ArithmeticException("Nu vreau numere mai mici ca 0");
        }
        this.a = a;
    }

    public int getLifeExpectation() {
        expectedLifeInYears = 15;
        return expectedLifeInYears;
    }
}
