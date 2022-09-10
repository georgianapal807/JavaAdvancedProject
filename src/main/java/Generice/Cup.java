package Generice;

public class Cup<E extends Liquid> {
    private E liquid;

    public Cup(E liquid) {
        liquid = liquid;
    }

    public Cup() {

    }

    public void drink(){
        System.out.println("I am drinking " + liquid);
    }

    public E getLiquid() {
        return liquid;
    }

    public void setLiquid(E liquid) {
        this.liquid = liquid;
    }
}
