package ArrayPgm;
import java.util.Scanner;
public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Min and Max element of Array
        int min=0,max=0;
        int size=sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i< arr.length;i++){
          arr[i]=sc.nextInt();
        }
        min=arr[0];
        max=arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
            } if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("min and max= "+min+" "+max);

        //2nd min max of array element
        int secmin=Integer.MAX_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<secmin && arr[i]!=min){
                secmin=arr[i];
            }
            if (arr[i]>secmax && arr[i]!=max){
                secmax=arr[i];
            }
        }
        System.out.println("2nd min and max= "+secmin+" "+secmax);

        }
}
