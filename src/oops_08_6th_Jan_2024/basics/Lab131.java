package src.oops_08_6th_Jan_2024.basics;

public class Lab131 {
    public static void main(String[] args) {

      // contains returns true and false
        String name = "Binit";
        // concat by using concat function and by using + operator
        System.out.println(name.concat(" Thakur "));
        System.out.println(name + "Thakue");

        // contains function
        System.out.println(name.contains("B"));
        System.out.println(name);

        // Stored into the object area not in String Constant Pool
        String name2 = new String("Thakur");

        // equalsIgnore Case
        String expected_result = "password@123"; // used small "p"
        String actual_result = "Password@123"; // used Capital "P"
        if (expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Yes");  // It will ignore the case
        }


    }
}
