package src.oops_14th_Jan_2024.exception;

public class Lab163 {

    public static void main(String[] args) {
    String sh = args[0]; // 5,15 -> String 5,15 -> java.lang.NumberFormatException
    int x = Integer.parseInt(sh); // 2 -> (String to Primitive) if pass Binit then ->"main" java.lang.NumberFormatException
    int a = 10/x; // 0 -> java.lang.ArithmeticException

        System.out.println(x);
        System.out.println(a);

    }
}

        // JVM wil be initialized
        // Creates and start the main thread.

      // Main thread will do the following tasks
      //1) Collect the command line arguments
      //2) Creates the String array with CLA
      //3) Call main method by passing String array as Parameter
      //Lab163.main(str);
      //Now control will be transfered from main thread to main method

//Control will come back to main thraed in two ways.
//A) when problem comes in the main -> JVM
// Creates the objects of identified Exception class.
// Arithmetical Exception a = new Arithmetical Exception()