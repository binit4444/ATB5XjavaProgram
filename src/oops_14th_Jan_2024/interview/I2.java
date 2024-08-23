package src.oops_14th_Jan_2024.interview;

public class I2 {
    public static void main(String[] args) {

        System.out.println(PP.a);
        concreteClass c = new concreteClass();

        // Object should belongs to concrete class
        // Grandfather ref with son's object
        PP p1 = new concreteClass();// Dynamic Dispatch
        Rofl R1 = new concreteClass();
        concreteClass c1 = new concreteClass();
        c.m1();
        R1.say();
    }

}

interface PP{
    int a = 12;
    void m1();
}
// Rofl is also incomplete
abstract class Rofl implements PP{
    abstract void say();
}

class concreteClass extends Rofl{

    @Override
    public void m1() {

    }

    @Override
    void say() {

    }
}