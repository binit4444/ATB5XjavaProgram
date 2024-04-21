package src.basics_04_17Dec;

import java.awt.*;
import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {

        // Triangle Classifier:

        // write a program that classifies a triangle based on its side lengths.
        // Given the three input values representing the lengths of the sides, determine

        // if the triangle is equilateral (all sides are equal),\
        // isosceles (exactly two side are equal),or
        // scalene (no sides are equal).
        // use an if-else statement to classify the traingle.

        //side 1, side 2, side 3 -> side1 == side2 == side3 -> Equilateral
        //(side1 == side2) or side2 == side3 -> Isosceles
        // Scalene


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1,side2,side3, I will tell about the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("EQ");
        } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("ISO");
        }else {
            System.out.println("Scalene");
        }



    }
}
