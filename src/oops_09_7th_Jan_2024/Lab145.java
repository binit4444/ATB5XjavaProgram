package src.oops_09_7th_Jan_2024;

import java.util.Scanner;

public class Lab145 {
    public static void main(String[] args) {

      //  Person p = new Person();
       // new Person(); // it also called default constructor


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Name");
        String name = sc.next();

        Person p2 = new Person(name);
        p2.printDetails();

        System.out.println("Enter the second Name");
        String name2 = sc.next();

        Person p3 = new Person(name2);
        p3.printDetails();

        sc.close();


      //  Person p2 = new Person("Binit");
      //  p2.printDetails();

      //  Person p3 = new Person("Amit");
      //  p3.printDetails();


        // p3 -> name -> Amit -> this -> p3
        // p2 -> name -> Binit -> this -> p2
        // p -> nmae  -> null  -> this -> nothing





    }
}
