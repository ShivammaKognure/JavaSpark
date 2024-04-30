package ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        // All Operations
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        for(int i=30;i<=80;i+=10){
            list.add(i);
        }

        if(list.isEmpty())
            System.out.println("List is Empty");
        else
            System.out.println("List Contain Element");
        System.out.println("List "+list);
        System.out.println("Size is "+list.size());

        System.out.println("Enter Index to get element");
        int index=sc.nextInt();

//        if(index>=0 && index<=list.size()){
//            System.out.println("Element at "+index+" "+list.get(index));}
//        else{
//            System.out.println("Invalid index");}
        try{
            System.out.println("Element at "+index+" "+list.get(index));
        }
        catch(IndexOutOfBoundsException ex) {
            System.out.println("Invalid Index");
        }



    }
}
