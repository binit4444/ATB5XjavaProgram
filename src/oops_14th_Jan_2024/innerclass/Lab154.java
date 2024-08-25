package src.oops_14th_Jan_2024.innerclass;

public class Lab154 {
    public static void main(String[] args) {
        Binit b = new Binit();
        // In case of normal class
        Binit.Ipad pi = b.new Ipad();
        pi.eating();
        // In case of static class
        Binit.bb aa = new Binit.bb();
        aa.cc();
        // We can call static function directly
        Binit.bb.abc();


    }
}

// Class Members
class Binit{
    int age = 31; // Data Members / Instance Variable

    // Methods
    void easy(){
        System.out.println("I am eating");
    }

    //Normal Inner class
    class Ipad{
        void eating(){
            System.out.println("I am IPAD");
            System.out.println(age);
        }
    }
    // Inner static class
    static class bb{
        void cc(){
            System.out.println("I am static class");
        }
         // static function
        static void abc() {
            System.out.println("Static Function");
        }
    }
}
