package src.oops_14th_Jan_2024.wrapperclass;

public class Lab160 {
    public static void main(String[] args) {
        int x = 123;
       // String str1 = x;
       // String str1 = (String)x; // Downcasting also not possible
        //
        String str1 = x+"";
        String s1 = String.valueOf(x); // you can use value of function directly
        System.out.println(str1);
        System.out.println(s1);


    }
}
