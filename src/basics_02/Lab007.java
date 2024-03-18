package src.basics_02;

public class Lab007 {
    public static void main(String[] args) {


        System.out.print("Helllo World");
        System.out.println("Hello Binit");
        //print > it will print the words without generating next line
        // so in this case 'Helllo WorldHello Binit' will print in same line
        //println > it will print in the next line


        // difference between println vs print

        int age = 20;

        // %d >  any integer -- (byte,int,short etc)
        //%s > String if u want to use
        //%c > Char
        //%f >  float

        System.out.println("Your age is " + age);
        System.out.printf("Your age is %d" ,age);



        //This is Known as formatting
         // printf > here %d is replaced by age, and we have value of age=20
        // two ways 1st by using + operator (Concatination)

       // System.out.println("Your age is %d"); in case of ln it is normal %d
        //printf > the value get replaces

    }
}
