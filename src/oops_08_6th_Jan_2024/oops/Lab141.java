package src.oops_08_6th_Jan_2024.oops;

public class Lab141 {
    public static void main(String[] args) {


        // OOPs concept

        // Person - class blueprint
        // p - ref-variable
        // new Person() - Real Object

        Person p = new Person();
        p.name = "Binit";
        System.out.println(p.name);

        Person p2 = new Person();
        p2.name = "Pramod";
        System.out.println(p2.name);

        // Object without reference
        new Person();  // object -> new Object
        // Person(); -> Method or Function
        Person p3 = null;
        System.out.println("End of the Program");








    }
}
