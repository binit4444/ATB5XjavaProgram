package src.oops_14th_Jan_2024.interview;

public class I1 {
    public static void main(String[] args) {
        System.out.println(H.a);
       // System.out.println(H.m1()); // function is not static

        // Now you can access the m1() Function
        binit b = new binit();
        b.m1();
    }
}
  //  Q can we use H.a directly in I1 class
// Yes cause in interface all variables are static in nature

interface H{
    //Only static variable
    int a = 10;
    int b = 20;
    void m1(); // But here function is not static
}

class binit implements H{

    @Override
    public void m1() {
        System.out.println("Non static");
    }
}