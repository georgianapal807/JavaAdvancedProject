package StreamingAPIs;

import java.util.List;

@FunctionalInterface
public interface EvenNumbers {
    List<Integer> filterNumbers(List <Integer> numbers);
   // void doSomethingAgain();
}
