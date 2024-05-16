package src.oops_09_7th_Jan_2024.inheritance;

public class Lab146 {
    public static void main(String[] args) {

        // What is Inheritance
        // Inheritance provides a way to create a new class from an existing class
        // SuperClass /  Parent Class / Base Class
        // SubCalss  /  Child Class  / Derived Class
        // The extends Keyword

        // subClass extends SuperClass
        // Content of subClass

        Programming p = new Programming(); // Parent Class
        // How JVM unerstand this program

        // Programming - Class
        // p -> ref to the Object
        // new Programming -> Object()
        // DC is Called

        p.printInfo();



        Programming p2 = new Programming("Perl",12);

        // How JVM unerstand this program

        // Programming - Class - Class Loader
        // p2 -> ref to the Object
        // new Programming -> Object()
        // Parameterized Constructor is calld

         p2.printInfo();

    }
}