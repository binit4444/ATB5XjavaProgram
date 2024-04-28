package src.basics_06_24Dec;

public class Lab099 {
    public static void main(String[] args) {

        int [] marks_10 = {96,90,87,56};
        System.out.println(marks_10.length);
        System.out.println(marks_10[0]);
        System.out.println(marks_10[1]);
        System.out.println(marks_10[2]);
        System.out.println(marks_10[3]);
       // System.out.println(marks_10[4]); // Exception in thread
        // Index - 0 to (lenght -1)


        int[] a = new int[4];
        // a -> [0,0,0,0] - default value of int -> 0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]); // 0 to 3

        a[0] = 78;
        System.out.println(a[0]); // assign the value
        a[1] = 98;
        a[0] = 89; // Reassign the value
        // System.out.println(a[5]);  // Java.lang.ArreyIndexOutOfBoundsException

        final int[] b = new int[4];
        // b -> [0,0,0,0]
        b[0] = 78;
        System.out.println(b[0]);
        // final means lenght is final in this case but value can change here



    }
}
