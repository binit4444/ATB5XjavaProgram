package src.oops_08_6th_Jan_2024.basics;

import java.util.Locale;
import java.util.Scanner;

public class Lab137 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String, I will check for Palindrome");
        String user_input = scanner.next();
      //  user_input = user_input.toLowerCase(); // Optional, if using .equalsIgnorecase function
        boolean result = isPalindrome(user_input);
        if (result){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }


    }

    private static boolean isPalindrome(String userInput){
        String original_str = userInput; // Binit, naman
        StringBuilder sb = new StringBuilder(userInput);
        sb.reverse();
       return original_str.equalsIgnoreCase(sb.toString());

       // Second way
        //  String reverse_string = sb.reverse().toString(); // tiniB, naman
        //  return original_str.equalsIgnoreCase(reverse_string); // Binit == tiniB false

    }



}
