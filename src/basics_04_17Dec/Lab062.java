package src.basics_04_17Dec;

public class Lab062 {
    public static void main(String[] args) {

        // Advance switch loop

        // JDK 13 (Its work Only)
        int itemcode = 003;
        switch (itemcode){
            case 001, 002, 003 :
                System.out.println("It's an electronic gadget");
                break;
            case 004, 005 :
                System.out.println("It's an mechanical device");
                break;
            default:
                System.out.println("It's an software product!");
        }


    }
}
