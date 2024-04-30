package Polymorphism;
class Shapes{
    void draw(){
        System.out.println("Drawing...");
    }
}
class Rectangle extends Shapes{
    void draw(){
        System.out.println("Rectangle Drawing...");
    }
}
class Square extends Shapes{
    void draw(){
        System.out.println("Square Drawing...");
    }
}
class Circle extends Shapes{
    void draw(){
        System.out.println("Circle Drawing");
    }
}
public class ShapePolym {
    public static void main(String[] args) {
        Shapes s=new Shapes();
        s.draw();

        Rectangle r=new Rectangle();
        r.draw();
        s=new Square();
        s.draw();
        s=new Circle();
        s.draw();

    }

}
