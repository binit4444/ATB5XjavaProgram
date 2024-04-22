package src.basics_05_23Dec;

public class Lab091 {
    public static void main(String[] args) {


        // Diff between For and While loop

        int i = 10;
        while (i>10){
            System.out.println(i);
            i++;
        }
        System.out.println(i); // out of loop so printed
        // value of i will print because out of loop
        // but the vale inside will not print because  of false condition

        // Incase of For Loop we cant use J again outside the loop
        // it is not accepted
        for (int j = 10; j < 10; j++) {
            System.out.println(j);
        }
     //   System.out.println(j); // cann't use cause its within the for loop



        }
}

