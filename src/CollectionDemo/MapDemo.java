package CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        /*Map= no duplicate key
        input order not preserve
        null only 1 time

         */

        Map<Integer,String> mapdemo= new HashMap<>();
        mapdemo.put(1,"Raj");
        mapdemo.put(2,"Simran");
        mapdemo.put(3,"Kajal");
        mapdemo.put(4,"Rishab");
        System.out.println(mapdemo);
        mapdemo.put(null,"nullvalue");
        mapdemo.put(2,"Sonal");
        System.out.println(mapdemo);

        // Using Iterator
        Iterator<Map.Entry<Integer,String>> iterator = mapdemo.entrySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
         //Print only keys
        Iterator<Integer> itr= mapdemo.keySet().iterator();

        while (itr.hasNext()){
            Integer key=itr.next();
            System.out.println("Key="+key);
            System.out.println("Value="+mapdemo.get(key));
        }
    }
}
