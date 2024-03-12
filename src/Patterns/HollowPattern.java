package Patterns;

import java.util.Scanner;

public class HollowPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //soid rectangle
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //solid hollow
        System.out.println("//////");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n||j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        //soid triangle
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Hollow triangle
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(i==n||j==0) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<i;j++){
                if(j==1) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
