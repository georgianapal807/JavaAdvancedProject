package Generice;

import java.util.ArrayList;
import java.util.List;

public class Glass<T extends  Liquid> {
    private List<T> object;

    public Glass() {
        this.object = new ArrayList<>();
    }

//    public T getObject() {
//        return object;
//    }
//
//    public void setObject(T object) {
//        this.object = object;
//    }

    public void doSomething() {
        System.out.println(object);
    }

    public void add(T newObject) {
        object.add(newObject);
    }

}
