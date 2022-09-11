package StreamingAPIs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> someNumbers = List.of(1, 2, 6, 2, 1, 3, 7, 2, 1, 12, 6, 7, 8, 8);
        List<Integer> someNewNumbers = new ArrayList<>();
        for (Integer number : someNumbers) {
            if (number % 2 != 1) {
                someNewNumbers.add(number * 2);
            }
        }
        for (Integer number : someNewNumbers) {
            if (number > 20)
                System.out.println(number);
        }
        System.out.println("-------------------------------------------------");

//////////////////STREAMING API/////////////////////
        Integer numberFound = someNumbers.stream()
                .filter(number -> number % 2 != 1)  // Kind of IF
                .map(number -> number * 2) //This is a function, you can do any operation
                .filter(number -> number > 20) //IF number is greater than 20
                .findFirst().orElseGet(getNumberSupplier());//It takes only the first number ----
        System.out.println(numberFound);
        System.out.println("-------------------------------------------------");


        someNumbers.stream()
                .filter(number -> number % 2 != 1) //Kind of IF
                .map(number -> number * 2) //Double the number, this is a function
                .filter(number -> number > 20) //IF number is greater than 20
                .collect(Collectors.toList()) //put them in a list
                .forEach(number -> System.out.println(number)); //print each number

        System.out.println("-------------------------------------------------");
        //LAZY FUNCTIONS
        Supplier<Integer> number = getNumberSupplier();
        Supplier<Integer> supplierImplementation = new SupplierImplementation();
        System.out.println(number.get());
        System.out.println(supplierImplementation.get());

        System.out.println("-------------------------------------------------");
        //INTERFACE
        EvenNumbers myInterface = (myNumbers) ->  //override of method is between the {}
                myNumbers.stream()                          //filter the list with our conditions
                        .filter(myNumber -> myNumber % 2 != 1)
                        .collect(Collectors.toList());
        myInterface.filterNumbers(someNumbers)
                .forEach(System.out::println);
    }

    private static Supplier<Integer> getNumberSupplier() { //THE LAZY FUNCTION
        return () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 5 * 5;
        };
    }

    private static Integer getNumber() { //THE FUNCTION WITH NORMAL RETURN
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 5 * 5;
    }
}
