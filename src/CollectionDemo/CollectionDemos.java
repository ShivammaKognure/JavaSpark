package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class A implements Cloneable{
int b=10;
    @Override
    public A clone() {
        try {
            return (A) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
public class CollectionDemos {
    /*
    Order Preserve
    Duplicates allow
    intial capacity = 10

    new capacity = (current capacity*1.5)+1
    */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        List<Integer> list1=new ArrayList<>();
        list1.add(50);
        list1.add(60);
        list1.add(70);
        System.out.println(list.addAll(list1));
        System.out.println(list);
        System.out.println(list.size());     //list has no length() method it has size()

        System.out.println("/////////////For Loop////////////////");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("//////////// Iterator /////////////////");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("///////////////For each//////////////");
        for(int value:list){
            System.out.println(value);
        }

        //Cloneable example
        System.out.println("///////////////Cloneable example//////////////");
        A a=new A();
        System.out.println(a.hashCode());
        System.out.println(a.b);

        A cloneObj = a.clone();    //create same copy of a object but on diff hashcode
        a.b=20;
        System.out.println(a.b);
        System.out.println(cloneObj.hashCode());
        System.out.println(cloneObj.b);

    }
}

