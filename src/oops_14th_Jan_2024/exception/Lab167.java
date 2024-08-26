package src.oops_14th_Jan_2024.exception;

public class Lab167 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int x = 10/a;
        }catch (Exception e){
            System.out.println("Exit");
            System.exit(0);
        }finally {
            //Write the code which you want 100% to be executed
            // database close
            System.out.println("I am Final");
        }


    }
}
