package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {

        // if,Switch - Condition Based
        // Loops -> Which will repeat something - for, while, do while

        // Switch - Condition based - Multiple Condition
        // If else If else



        // Which day is today?    (Program)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day, I will tell which day it is");
       // 1 -> Monday, 7 -> Sunday, MTWTFSS , Invalid -> 99 -> Are u Mad?
       int dayNumber = sc.nextInt();

      // String day = null;

       switch (dayNumber){
           case 1:
               System.out.println("Mon");
               break;
           case 2:
               System.out.println("The");
               break;
           case 3:
               System.out.println("Wed");
               break;
           case 4:
               System.out.println("Thu");
               break;
           case 5:
               System.out.println("Fri");
               break;
           case 6:
               System.out.println("Sat");
               break;
           case 7:
               System.out.println("Sun");
               break;
           default:
               System.out.println("ARE YOU MAD?");
               break; // this last break is optional if default is option
       }

        System.out.println(" End Of Program ");

    }
}
