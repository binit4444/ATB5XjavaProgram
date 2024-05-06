package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab127 {
    public static void main(String[] args) {

        // Prime Number Condition num%i(i -> 2 to num) == 0 -> X(not prime)
        // 0 -> X
        // 1 -> X
        // 2 -> X

        int i = 0;
        int flag = 0;
        int m = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n = sc.nextInt();

        // 17 -> 2 to 17/2 -> num%i == 0 -> Not a Prime

        m = n/2;
     if (n == 0 || n == 1) {
         System.out.println("Not a Prime -> " + n);
     }else {
         for (i = 2; i <= m; i++) {
             if (n % i == 0){
                 System.out.println("Not a Prime Number");
                 flag = 1;
                 break;
             }
                }
            }

          if (flag == 0 ){
              System.out.println("Prime Number -> " + n);
          }



    }

}
