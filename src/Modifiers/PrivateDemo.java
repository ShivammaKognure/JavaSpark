package Modifiers;

class MyPrivateDemo{    //Private Variable available in only this class
    private int privateVariable=10;

    private void privateMethod(){
        System.out.println("Main hu private");

    }
    void display(){    // non private method calling private variable and method in same class
        privateMethod();
        System.out.println(privateVariable);
    }

}
public class PrivateDemo {
    public static void main(String[] args) {
        MyPrivateDemo d1=new MyPrivateDemo();
        //d1.privateMethod();      cant use private method variable here
        d1.display();
    }

}
