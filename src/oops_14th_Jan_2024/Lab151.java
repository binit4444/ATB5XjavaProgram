package src.oops_14th_Jan_2024;

public class Lab151 {
    public static void main(String[] args) {
        P01 p01 = new P01();
        P01 p02 = new P01();

        p01.m1();  // Called normal function by using object reference
        P01.m2();  // Called static function by using class name directly

        //With null object you can't call m1 function
        P01 p03 = null;
       // p03.m1();
        p03.m2();  // but we can call static function even with no object



    }
}

class P01{

    static {
        System.out.println("SIB");  // static initialization block
    }

    {
        System.out.println("IIB");  // Instance initialization block
    }

    int a = 10;
    static int b = 20;

    // Normal function
    void m1(){
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }

    static void m2(){
        //Can't use a here cause static fuction cant have instance variable
      //  System.out.println(a);
        System.out.println(b);
    }

}