package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {

        // Using only IF condition
        // This is not recomended way so use if else

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score");
        int score = sc.nextInt();


        if (score >= 90 && score <= 100){
            System.out.println("Your score -> A");
        } if (score >= 80 && score <= 89){
            System.out.println("Your score -> B");
        } if (score >= 70 && score <= 79){
            System.out.println("Your score -> C");
        } if (score >= 60 && score <= 69){
            System.out.println("Yourb score -> D");
        }if (score >= 0 && score <= 59){
            System.out.println("Your score -> F");
        }

        // In this case last else is not required cause last else is conditionless


    }
}
