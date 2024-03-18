package src.basics_02;

public class Lab011 {

    public static void main(String[] args) {

        char c = 'A';
        System.out.println(c);

        //char c1 = "$"; > string in double codes

        char c1 = '$';
        System.out.println(c1);
        // special characters is acceptable

        char c2 = '\n';
        System.out.println(c2);
        //c2 > will print new or next line


        char c3 = '\u0000';  // unicode > :(, :) :| it will print unicode char like smily face etc.
        System.out.println(c3);

        char c4 = '\u0041'; //unicode of 'A'
        System.out.println(c4);
        //every char has its own unicode

        // ASCII Table
        // 0-9  48-57
        // A-Z  65-90
        // a-z  97-122

        //Decimal System
        int age = 10;

        // Octal
         int b =0101;
        System.out.println(b);

        // Binary
        int b2 = 0b101;

        //Hex
        int c45 =0Xface;



    }
}
