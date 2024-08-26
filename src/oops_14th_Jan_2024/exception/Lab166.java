package src.oops_14th_Jan_2024.exception;

public class Lab166 {
    public static void main(String[] args) {
        // Multiple try catch
        //But this is not ideal approach use try catch in single ways ex Lab165
        int a = 10;
        try {
            a = Integer.parseInt(args[0]);
        }catch (NumberFormatException exception){
            exception.printStackTrace();
        }

        try {
            int b = 10/a;
        }catch (ArithmeticException exception){
            exception.printStackTrace();
        }

        try {
            String ip = args[0];
        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }

    }
}
