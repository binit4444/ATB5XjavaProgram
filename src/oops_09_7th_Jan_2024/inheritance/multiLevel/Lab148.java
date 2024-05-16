package src.oops_09_7th_Jan_2024.inheritance.multiLevel;

public class Lab148 {
    public static void main(String[] args) {

       // Grandfather g = new Grandfather(); // SuperClass
       // g.bhk3();
        // Super calss only access rheir own Variable

        // SubClass  // SuperClass for Son Class
      //  Father f = new Father();
       // f.bhk3();
      //  f.bhk2();

        // SubClass  // Preferred to use this Class
        Son s = new Son();
        s.bhk1();
        s.bhk2();
        s.bhk3();

        Grandfather g = new Son(); // Allowed parent ref and child Object
        Father f = new Son(); // also allowed
       // Son s = new Grandfather(); Not allowed
       // Son s = new Father();  Not allowed
       // Son s = new Son();



    }
}
