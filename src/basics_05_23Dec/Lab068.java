package src.basics_05_23Dec;

import java.util.Scanner;

public class Lab068 {

    public static void main(String[] args) {

        // 3/ x^2 + y^2 - |z| that is the Statement  (Q)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X");
        double x = sc.nextDouble();
        System.out.println("Enter the Y");
        double y = sc.nextDouble();
        System.out.println("Enter the Z");
        double z = sc.nextDouble();

        double result;  // or double result = 0;  use what you like

        // 3/ x^2 + y^2 - |z| that is the Statement
        // A+B-C -> A -> x^2 , B ->  y^2 , C -> |z| abs(z) = + value of z

        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);


        // Scanner steam should be close after we are done.
        sc.close();

        System.out.println(" --- End of Program ---");



    }

}
