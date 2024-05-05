package src.oops_07_30Dec;

public class Lab112 {
    public static void main(String[] args) {

     //   int a = 10;
      //  int b = 20;
     //   int c = a+b;
     //   System.out.println(c);

     //   a = 34;
     //   b =45;
     //   int d = a+b;
     //   System.out.println(d);

        int c = binit_sum(3,4);   // arguement (3,4) = two arguments
       int c1 = binit_sum(); // No argument
        int c2 = binit_sum(3); // 1 argument
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

    }

        static int binit_sum(int x, int y){     // Name of the function can be anything (binit_sum)
          return  x+y;
           }
           // Two Function now we have
           static int binit_sum(int x){
        return x;
           }

           static int binit_sum(){  // no argument
        return 99;
           }

           static void sayHello(){
               System.out.println("Say Yes");
           }

}
