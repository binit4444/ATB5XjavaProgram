package src.oops_14th_Jan_2024.interview;

public class Abstract01 {

}


abstract class Person01{
    // abstract class can have both incomplete and complete method
    abstract void say();
    void eat(){
        System.out.println("Hello eat from Person01 Class");
    };
}

abstract class Student extends Person01{
    abstract void m2();
}

class Binit extends Student{

    @Override
    void say() {

    }

    @Override
    void m2() {

    }
}