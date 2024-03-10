package ArrayPgm;
import java.util.Scanner;
public class ArrayEleSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int s=sc.nextInt();
        int[] arr=new int[s];
        //input array
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //Display Array
        System.out.println("Array Elements:");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.println(arr[i]);
        }
        //Sum of Elements
        System.out.println("Sum is:"+sum);

        //Reverse Array
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }

}
