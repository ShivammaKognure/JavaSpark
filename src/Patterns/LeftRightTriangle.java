package Patterns;

import java.util.Scanner;

public class LeftRightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row num");
        int r=sc.nextInt();
        //Left
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Right
        System.out.println("///");
        for(int i=0;i<r;i++){
            for(int j=0;j<r-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverse Left
        System.out.println("///");
        for(int i=r;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Inverse Right
        System.out.println("///");
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=r;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
