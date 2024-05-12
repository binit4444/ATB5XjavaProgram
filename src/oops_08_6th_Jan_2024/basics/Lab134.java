package src.oops_08_6th_Jan_2024.basics;

public class Lab134 {
    public static void main(String[] args) {


        // Immutable in nature ( Can't be Changed )
        String password = "password@123";

        // 1000 times if we are going to change the password value then
        // we sould use the string Builder/buffer instead of normal String


        // Mutable -> ( Can be Changed )
        StringBuilder password2 = new StringBuilder("Binit");
        password2.append(" Thakur ");
        System.out.println(password2);
        //append is like concat in case of String builder/Buffer




    }
}
