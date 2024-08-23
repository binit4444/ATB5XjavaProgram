package src.oops_14th_Jan_2024.innerclass;

public class Lab152 {
    public static void main(String[] args) {

        Car c = new Car("Lembo 137");
      //  c.drive();
        Car.Engine engine = c.new Engine("400cc");
        engine.start();
        c.drive();

        // Syntax OC.IC = OCRef.new IC();

    }

}

class Car{
    String make;  // Instance variable

    // Parameterised constructor
    public Car(String make){
        this.make = make;
    }

    void drive(){
        System.out.println("Yes you can drive Car ");
    }

    // innerclass

    public class Engine{
        // Instance Variable
        String hoursepower;

        // Parameterised constructor
        public Engine(String hoursepower){
           this.hoursepower = hoursepower;
    }
    // method
        void start(){
            System.out.println("Engine is started  -> " + make);
        }
    }

}
