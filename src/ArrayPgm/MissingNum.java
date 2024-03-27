package ArrayPgm;

import java.util.Scanner;

public class MissingNum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int sumTotal;
        for(int i:arr){
            sum+=i;
            System.out.println(i);
        }
        sumTotal=((n+1)*(n+2))/2; //Sum of First n natural numbers up to size
        int miss=sumTotal-sum;    //totalsum - sum of array ele is missing num
        System.out.println("Missing num is "+miss);





    }
}
