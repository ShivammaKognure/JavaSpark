package Patterns;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //left 12
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
System.out.println("//////");
        //inverted left 12
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //right 123
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){ //j=1 j<=i
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("//////Floyd's Triangle//////");
        int a=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                a++;
                System.out.print(a+" ");
            }
            System.out.println();
        }
        System.out.println("//////0-1 Triangle//////");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int sum=i+j;
                if(sum%2==0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println("////// Triangle//////");
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("//////Palindrome Triangle//////");
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
