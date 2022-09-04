public class Employee implements Contract{

    @Override
    public void doSomething() {
        System.out.println("Do something");
    }

    @Override
    public String getString(){
        return "Get string";
    }
}
