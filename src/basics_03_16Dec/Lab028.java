package src.basics_03_16Dec;

public class Lab028 {

    public static void main(String[] args) {

        int course = 100;
        float GST = 0.1845f;
        float total = course+ GST*course;
        System.out.println(total);

        // int course = 100;
        //        float GST = 0.1845f;
        //        float total = (int)GST*course;
        //        System.out.println(total);
        // you will lose value

        float course2 = 100;
        float GST2 = 18.45f;
        double total2 = course2+ GST2;
        System.out.println(total2);

    }
}
