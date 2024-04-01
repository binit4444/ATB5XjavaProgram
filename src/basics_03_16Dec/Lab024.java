package src.basics_03_16Dec;

public class Lab024 {

    public static void main(String[] args) {

       int a = 12;
       boolean b = a > 10 || a < 5;
        System.out.println(b);

        boolean b1 = !(a > 10 || a < 5); // in this case output false
        System.out.println(b1);


    }
}
