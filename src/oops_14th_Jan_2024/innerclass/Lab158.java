package src.oops_14th_Jan_2024.innerclass;

public class Lab158 {
    public static void main(String[] args) {
   //    Parent parent = new Parent();
   //    Child child = new Child();
   //    parent= child; // references
      //  child = parent;  // not allowed

        Hello hello = new Child2();
        Hello hello2 = new Hello();
       // Child hai = hello;

        // DownCasting in Class
        Child2 hai = (Child2)hello; // child ref = parent ref forcefully done with child object

    }
}

class Hello{}
class Child2 extends Hello{}







// Upcasting and Downcasting in class

class Parent{}
class  Child extends Parent{}
