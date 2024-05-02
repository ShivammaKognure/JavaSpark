package CollectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> setdemo= new HashSet<>();
        setdemo.add(10);
        setdemo.add(20);
        setdemo.add(30);
        setdemo.add(40);
        System.out.println(setdemo);
        System.out.println(setdemo.remove(30));
        System.out.println(setdemo);
    }
}
