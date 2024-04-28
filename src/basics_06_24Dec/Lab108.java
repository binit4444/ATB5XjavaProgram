package src.basics_06_24Dec;

public class Lab108 {
    public static void main(String[] args) {

        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.
        // use an if-else statement to make this determination.

        // Coding ->
        // 1. user input - ?
        // 2. Rough logic -> (years%4 == 0) -> leap and ((year%100 =/= 0) -> leap or year%400 == 0))
        // 3. Brute Force
        // 4. Logic Correction

        int year = 2020;
        // (year%4 == 0)
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Year");
        }

        System.out.println("-- End of program --");


    }
}
