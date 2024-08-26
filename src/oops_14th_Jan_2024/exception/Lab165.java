package src.oops_14th_Jan_2024.exception;

public class Lab165 {
    public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10/a;
            System.out.println(a);
            System.out.println(b);
        }catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
         //   e.printStackTrace();  // Comment it out if you don't want to see red exception

            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be executed anyhow  ");
        }



    }
}
