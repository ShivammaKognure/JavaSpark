package ArrayPgm;

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] arr1=new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("First array");
        for(int a:arr){
            System.out.println(a);
        }
        for(int i=0,j=arr1.length-1; i< arr1.length; i++,j--){

            arr1[i]=arr[j];

        }
        System.out.println("Second array");
        for(int a:arr1){
            System.out.println(a);
        }


    }
}
