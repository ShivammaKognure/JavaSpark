package Modifiers;
class MyProtectedClass{
protected int a=199;
protected void display(){
    System.out.println("This is Protected class");
}
}
public class ProtectedDemo {   // Available in same package and same package subclass
    public static void main(String[] args) {
        MyProtectedClass m1=new MyProtectedClass();
        m1.display();

    }
}
