package src.basics_05_23Dec;

public class Lab097 {
    public static void main(String[] args) {

     //   int i = 10;   // Init
      //  do {
       //     System.out.println(i);  // Body
       //     i++;  // Increment
      //  }while (i <= 10);  // Condition


        // EX -> 2
        //If you want ton execute the block at least 1 then use do-while statement

        int i = 10;
        do {
            System.out.println(i);
            i++;
        }while (i < 10);

        // 10 will print instead of nohing
        //Because first initialization 2) then body will execute so it print 10
        // 3) After execution we will check condition Which is false in this case



        System.out.println(" --- End of Program ---");


    }
}
