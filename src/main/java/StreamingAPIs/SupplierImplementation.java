package StreamingAPIs;

import java.util.function.Supplier;

public class SupplierImplementation implements Supplier<Integer> {

    @Override
    public Integer get() {
        return 5*5;
    }
}
