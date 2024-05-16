package src.oops_09_7th_Jan_2024.inheritance.hierarchical;

public class Lab148_A {
    public static void main(String[] args) {

        Car c = new Car();
        Truck t = new Truck();

        // Parent ref and Child Object allowed
        Vehicle v1 = new Car();
        //Car c2 = new Vehicle(); // Not allowed
        //Truck t2 = new Vehicle(); // Not allowed


        // there is no Relationship betw- them
       // Car c3 = new Truck();

    }
}
