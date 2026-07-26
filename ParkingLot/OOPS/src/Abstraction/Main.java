package Abstraction;

abstract class Bird{

    abstract  void fly();

    abstract void eat();

}
class Sparrow extends Bird{

    @Override
    void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    void eat() {
        System.out.println("Bird is eating");

    }
}

public class Main {
    public  static void main() {
        //Bird B=new Bird();
        Bird B =new Sparrow();
        B.fly();
        B.eat();
    }
}
