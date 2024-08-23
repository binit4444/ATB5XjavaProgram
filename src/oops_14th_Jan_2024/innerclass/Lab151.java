package src.oops_14th_Jan_2024.innerclass;

public class Lab151 {

}


class OC{
    int a = 10;


    class InnerClass{
        int b = 11;
        void m2(){
            System.out.println(a); // can access outer class variable in inner class
        }
    }

}