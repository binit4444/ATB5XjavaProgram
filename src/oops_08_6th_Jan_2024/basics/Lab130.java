package src.oops_08_6th_Jan_2024.basics;

public class Lab130 {
    public static void main(String[] args) {

        String name = "Binit"; // String Constant Pool
        String name2 = new String("Binit"); // Heap area

        name = "Thakur";

      //  String str1 = "Hello";
     //   str1.concat("Binit");
     //   System.out.println(str1); // O/P -> Hello
        //Instead of hello Binit only Hello Printed So Strings are immutable in nature


        // If value assign then it will print
        String str1 = " Hello ";
       str1 = str1.concat("Binit");
        System.out.println(str1);





    }
}
