package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        System.out.println(scanner.next());
    }

    // Two main but argument is different
     // Called as Main Overloading

    public static void main(int a) {
        System.out.println("Another Main");
    }

    public static void main(int a, int b) {
        System.out.println("Another Main");
    }

    public static int main(int a, int b, int c) {
        return 98;
    }

}
