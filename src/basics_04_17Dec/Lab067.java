package src.basics_04_17Dec;

public class Lab067 {
    public static void main(String[] args) {

        char code = 'A';
       int val = switch (code) {
           case 'A' :
               yield 55;
           case 'B' :
               yield 77;
           default:
               throw new IllegalStateException("Unexpected value: " + code);
       };
        System.out.println(val);

        // yield = return or its mean return


    }
}
