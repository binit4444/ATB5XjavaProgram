package src.oops_08_6th_Jan_2024.basics;

public class Lab132 {
    public static void main(String[] args) {

        String s1 = "Binit"; // String Constant Pool
        String s2 = new String("Binit"); // Object area
        System.out.println(s1 == s2); // Check references
        // false cause references are not equals
        String s3 = new String("binit");

        System.out.println(s1.equals(s2)); // Comppare the values

       // System.out.println(s1.equals(s3)); // O/P -> false

        // use equalsIgnore
        System.out.println(s1.equalsIgnoreCase(s3)); // O/P -> true



    }
}
