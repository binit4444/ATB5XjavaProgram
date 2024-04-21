package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score");
        int score = sc.nextInt();


        if (score >= 90 && score <= 100){
            System.out.println("Your score -> A");
        }else if (score >= 80 && score <= 89){
            System.out.println("Your score -> B");
        }else if (score >= 70 && score <= 79){
            System.out.println("Your score -> C");
        }else if (score >= 60 && score <= 69){
            System.out.println("Yourb score -> D");
        }else {
            System.out.println("Your score -> F");
        }

        // 4. Debug the code
        //We are debug and checking the code. ->
        //Other than int -> code fails - we will fix
        //Exceptions - in future.
        // 

        // 5. Fix the code and Final it

    }
}
