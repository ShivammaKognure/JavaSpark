package Modifiers;
//Only Available in same package subclass
public class ProtectedCheck extends MyProtectedClass{
    public static void main(String[] args) {
        ProtectedCheck p1=new ProtectedCheck();
        System.out.println(p1.a);
        p1.display();
    }
}
