package src.basics_04_17Dec;

public class Lab061 {
    public static void main(String[] args) {


        byte b = 20;
        switch (b){
            case 10:
                System.out.println("TEN");
            case 127:
                System.out.println("ONE TWENTY SEVEN");

                // Nothing will execute in this case
                // cause no matching (20 doesn't match with anything)
                // Even Default is not there so nothing printed.

                // If we add default then default will print here.
            default:
                System.out.println("Default Only");


        }


    }
}
