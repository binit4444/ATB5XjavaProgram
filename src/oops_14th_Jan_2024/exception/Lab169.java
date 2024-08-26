package src.oops_14th_Jan_2024.exception;

public class Lab169 {
    public static void main(String[] args) {

        extracted2();
        System.out.println("Main executed");

        // so exception we tell you where you have problem
        // Real problem is in line number 22 -> exception.Lab169.extracted(Lab169.java:22)

    }


    private static void extracted2(){
        extracted1();
        System.out.println("Extracted2 executed");
    }

    private static void extracted1(){
        extracted();
        System.out.println("Extracted1 executed");
    }

    private static void extracted(){
        try {
            String name = null;
            name.length();
        }catch (Exception e){
          //  e.printStackTrace();  // it will give you red error
            e.getMessage();
        }

    }


}
