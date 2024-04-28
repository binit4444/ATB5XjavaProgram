package src.basics_06_24Dec;

public class Lab104 {
    public static void main(String[] args) {

        // Int,Long, String Float are acceptable
        int[] int_array = {99,92,63,34,15};
        float[] f_array = {45.45f,64.75f,23.12f,11.34f};
        double[] d_array = {43.54,65.12,89.556,};

        boolean[] b_array = {true,false,true,false};
        char[] c_array = {'A','B','C','D'};
        String[] names = {"Binit","Pratham","Paras","Shubham"};

        System.out.println(int_array.length);
        System.out.println(names.length);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }






    }
}
