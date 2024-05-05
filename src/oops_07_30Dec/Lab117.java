package src.oops_07_30Dec;

public class Lab117 {
    public static void main(String[] ref_name) {  // argument changed to anything or ref_name
        System.out.println("Run fine!!");

        int d = main(10);
        System.out.println(d);
        main("Binit");


    }

       // To call the function use static otherwise it will not print
     static void main(String a){
        System.out.println("I am a Function, but JVM will not recognize  ");
    }

     static int main(int a){
        return a+101;
    }

}
