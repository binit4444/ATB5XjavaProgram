package src.oops_14th_Jan_2024.exception;

public class Lab162 {
    public static void main(String[] args) {
        try {
            String name = null;
            name.trim(); // Null pointer exception
            System.out.println("I am Binit");
        }catch (Exception e){
            System.out.println("You are trying to trim a null String that is not possible");
        }
        System.out.println("End ");



    }

}


/*  Exception -
* event that occur during the execution of a program
*  that disrupt the normal flow of instruction
* */

