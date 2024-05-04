package CollectionDemo;

import java.util.*;
import java.util.Iterator;

public class VectorDemo {
    public static void main(String[] args) {
        /*
        vector thread safe
        order preserve
        duplicates allow
        allow random access
        initial capacity=10
        New capacity=cc*2

         */
        Vector<Integer> vector =new Vector<>();
        for(int i=0;i<10;i++){
            vector.add(i);
        }

        //Enumeration Cursor this is for legacy classes i.e. Old classes in version 1.0  vector,Dictionary
        Enumeration<Integer> element= vector.elements();
        while (element.hasMoreElements()){
            Integer integer=element.nextElement();
            System.out.println(integer);
        }
        System.out.println("/////");
        System.out.println(vector.capacity());//current capacity
        vector.addElement(5);
        System.out.println(vector.capacity());
        System.out.println(vector);
        System.out.println(vector.get(3));

        System.out.println("///List//");
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        //Iterator cursor for all collections
        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // ListIterator cursor only for List bidirectional hasPrevious() and prevoius()

        ListIterator<Integer> listI = list.listIterator();
        while(listI.hasNext()){
            System.out.println(listI.next());
        }
    }
}
