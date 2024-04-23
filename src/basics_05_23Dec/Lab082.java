package src.basics_05_23Dec;

public class Lab082 {
    public static void main(String[] args) {

        // for(A,B,C)
        // A -> Initialization -> JVM what variable, where you are starting point.
        // B -> Condition -> When you want to stop this.
        // C -> Increment/ Decrement


       // Print the Odd number in between the 1 to 50.
        // if else

            for (int i = 1; i <= 50; i++) {
                if (i%2==1){
                    System.out.println(i + " is Odd!");
                }

        }
            // For Even Number if (!(i%2==1))
        // Or if (i%2==0) -> Even Number

        System.out.println(" --- End of Program ---");


    }
}
