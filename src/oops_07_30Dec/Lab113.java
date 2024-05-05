package src.oops_07_30Dec;

public class Lab113 {
    public static void main(String[] args) {
        // What is a Function
        // Function can do some task.

        // How to create a Function
        // 1. Definition
        // 2. Call the Function.

        // Function vs Method(is different OOPs)

       sayHello04Times();  // Call the Function
        sayHello04Times(); // print 8 times

        double d = Math.pow(2,3);
        System.out.println(d);

        // OOPs - accessModifier (Private, Public and Proted


     // AccessModifier returnType metho methodName(ParemeterList) {
     //  Method body
        // }

    }

    static void sayHello04Times(){  // Definition
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello");
        }
    }  // hide the code



}
