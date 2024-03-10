package ArrayPgm;
import java.util.Scanner;


public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number to search:");
        int num=sc.nextInt();
        for(int s=0;s< arr.length;s++){
            if(num==arr[s])
                System.out.println("Number "+num+" Found at "+s);

        }


    }
}
