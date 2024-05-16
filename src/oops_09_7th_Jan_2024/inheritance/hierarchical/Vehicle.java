package src.oops_09_7th_Jan_2024.inheritance.hierarchical;

public class Vehicle {

    Vehicle(){
        System.out.println("DC Vehicle");
    }





    void vehicleHasToSpeed(){
        System.out.println("Yeah from" +getClass().getSimpleName());
    }


}
