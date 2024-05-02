package Modifiers;
import ProtectedCheck.ProtectedExm;
class MyProtectedClass{
protected int a=199;                // Available in same package and same package subclass
protected void display(){
    System.out.println("This is Protected class");
}
}
public class ProtectedDemo extends ProtectedExm {     //2nd example class from different package can access in child class
    // not in static method i.e. non static variable not access in static

    public void get(){
        System.out.println(a1);
        display1();

    }
    public static void main(String[] args) {
        MyProtectedClass m1=new MyProtectedClass();
        m1.display();



    }
}
