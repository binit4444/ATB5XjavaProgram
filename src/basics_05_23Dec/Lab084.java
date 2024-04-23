package src.basics_05_23Dec;

public class Lab084 {
    public static void main(String[] args) {

        // if loop doesn't have break condition
       // int a = 30;
      //  if (a==10) {
       //     break;
       // }


        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i%2==0){
                break;
            }

         //   System.out.println("Inside Loop");
            //after break we cant use this statement
        }
        // only one value will print here
        // break should we use with some kind of condition


        System.out.println(" --- End of Program ---");

    }
}
