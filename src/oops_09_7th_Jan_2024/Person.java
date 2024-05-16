package src.oops_09_7th_Jan_2024;

public class Person {

    String name;
    String age;
    int rollnumber;


    Person(){
        System.out.println("DC");
    }

    Person(String ref_name){
        this.name = ref_name;

    }


    void printDetails(){
        System.out.println("Your Name is -> " + this.name);
        System.out.println("Your Age is -> " + this.age);
        System.out.println("Your RollNumber is -> " + this.rollnumber);
    }



}
