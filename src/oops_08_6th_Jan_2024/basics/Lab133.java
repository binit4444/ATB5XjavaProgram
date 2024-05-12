package src.oops_08_6th_Jan_2024.basics;

public class Lab133 {
    public static void main(String[] args) {

        // 4 Ways to create Strings (Can't be changed)

        // Immutable in nature
        String s1 = "Binit"; // SCP
        String s2 = new String("Binit"); // objet area


          // Mutable in nature -> can be changed !!

     //   StringBuffer sbuf4 = new StringBuffer("Binit"); // objet area

     // Using a append function
        StringBuilder sb3 = new StringBuilder("Binit"); // objet area
        sb3.append(" Thakur "); // Their original value change in this case
        System.out.println(sb3);
        //append is like concat in case of String builder/Buffer


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World ");
        System.out.println(sb);
        // in both cases their original value change because they are mutable


    }
}
