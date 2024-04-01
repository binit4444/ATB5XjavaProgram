package src.basics_03_16Dec;

public class Lab021 {

    public static void main(String[] args) {
        // Interview Question - Relational Operator
        System.out.println(10 == 10);
        System.out.println(10 > 10);
        System.out.println(10 < 10);


        //System.out.println('A' = 65); // ASCII
        System.out.println('A' == 65);  //because ASCII value of A = 65 thats why its printed true
        System.out.println('A');
        System.out.println('S');

        byte b = 65;
        System.out.println('A' == b);
        System.out.println('A' == 65.0); //? ( This is Property of Java)
        System.out.println('A' == 65.0f);
        System.out.println('A' == 65.4);

       // System.out.println(true == 0); // java: incomparable types: boolean and int



    }
}
