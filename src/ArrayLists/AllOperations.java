package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AllOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();

        for(int i=1;i<=5;i++){
            list.add(i);
        }
        //System.out.println(list);

        Iterator<Integer> itr= list.iterator();
        while(itr.hasNext()){
            Integer ele= itr.next();
            System.out.println(ele);
        }
        System.out.println("Enter index to insert at");
        int idx=sc.nextInt();
        System.out.println("Enter ele to insert");
        int i=sc.nextInt();

        list.add(idx,i);
        System.out.println(list);
        System.out.println("remove ele from specified index");
        list.remove(5);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
