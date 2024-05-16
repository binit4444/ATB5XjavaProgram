package src.oops_09_7th_Jan_2024;

public class Dog {


        String name;  // Instance Variable

    Dog(){
        System.out.println("Default C");
    }

    Dog(String nameRef){
        this.name = nameRef;
        System.out.println("Param C");
    }


    void bark(){
        int age = 10; // Local Variable
        System.out.println("Bark");
        System.out.println("Dog name is -> " + name);

    }

    // age = 23; You cant use local variable outside this function


    }

