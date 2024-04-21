package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Browser Name, firefox, edge, opera");

        String browsr = sc.nextLine();

        switch (browsr.toLowerCase()){
            case "chrome":
                System.out.println("Execute the Chrome code");
                break;
            case "firefox":
                System.out.println("Execute the Firefox code");
                break;
            case "edge":
                System.out.println("Execute the Edge code");
                break;
            default:
                System.out.println("I have no idea which Browser is this");

        }

    }
}
