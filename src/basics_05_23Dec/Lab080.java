package src.basics_05_23Dec;

public class Lab079 {
    public static void main(String[] args) {

        // for(A,B,C)
        // A -> Initialization -> JVM what variable, where you are starting point.
        // B -> Condition -> When you want to stop this.
        // C -> Increment/ Decrement



        System.out.println("Print the value of i, but I want to break when i = 5");
        //Now we are printing first so 5 values will print
        // val 1 to val 5

        for (int i = 1; i <= 10; i++) {
            System.out.println("Value of " + i);
            if (i == 5){
                break;
            }
           // System.out.println("Value of " + i);
        }
        System.out.println("End");


    }
}
