package src.basics_02;

public class Lab013 {

    public static void main(String[] args) {

        double a = 34;
        double b = 10;
        double rersult = a%b;
        // % > mod > Reminder
        System.out.println(rersult);

        // how >>
        // 10 | 34 | 3  >> Quotient
        //    | 30 |
        //   -------
        //       4   >> Reminder

        // Example 2
        // 78%12
        //   12 | 78 | 6
        //      | 72 |
        //        6 >> Reminder   (that will print in result)

        int num = 34;
        int r = num%2;
        System.out.println(r);
        // Reminder >> 0 cause it perfectly divisible.
        // so 0 printed
        // even = 0
        //odd = 1  (35%2)

    }
}
