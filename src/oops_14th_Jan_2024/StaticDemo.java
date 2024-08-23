package src.oops_14th_Jan_2024;

public class StaticDemo {

    public static String college_name = "TheTestingAcademy";

    // Non static variable -> Local variable or Instance variable
    public int version = 3;

    // Static method
    public static void printName(){
        int age = 40;
        System.out.println("Name is " + college_name);

     // you can't have a Instance variable into the Static method!!
       // System.out.println("Verion is " + version);

    }

    // Non static method

    public void printversion(){
        int age = 23;
        System.out.println("Version is " + version);
        System.out.println("Name is " + college_name);
    }


}
