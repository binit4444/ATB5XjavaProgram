package src.oops_09_7th_Jan_2024;

public class ATBPerson {
    // ATBPerson class

    String name;    // Instance Variable values are default
    long phone;
    String email;
    boolean isMarried;
    String courseName;

    // Default constructor
    ATBPerson(){
        courseName = "ATB";
        System.out.println("I am Default");
    }

    // Parameterized constructor
    ATBPerson(String valuefromObjectRef){
       this.name = valuefromObjectRef;
        System.out.println("Parameterized constructor called");
    }

    // void function
    void talk(){
        System.out.println("Talk");
    }

    void printDetails(){
        System.out.println(this.name);
        System.out.println(courseName);

    }

}
