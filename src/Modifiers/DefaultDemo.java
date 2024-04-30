package Modifiers;

class MyDefaultDemo{
int a=100;
void print(){
    System.out.println("Genie...");
}
}
public class DefaultDemo {
    public static void main(String[] args) {
       MyDefaultDemo d1=new MyDefaultDemo();    //Accessible only in same package
       d1.print();
       System.out.println(d1.a);

    }
}
