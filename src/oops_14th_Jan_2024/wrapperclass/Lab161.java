package src.oops_14th_Jan_2024.wrapperclass;

public class Lab161 {
    public static void main(String[] args) {
        int a = 10;
        Integer a2 = Integer.valueOf(a);
        System.out.println(a2);

        // Collection framework -> Class -> Primitive data type
        // us wrapper classes in collection framework

        Character ch = 'a';
        // unboxing - character object to primitive conversion
        char a3 = ch;
        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.max(34,53));
        System.out.println(Integer.min(4,7));
        System.out.println(Integer.MAX_VALUE);


        double d = 23.44;
        String st2 = String.valueOf(d);
        Double st = Double.valueOf(d);
        int a22 = st.intValue();
        System.out.println(a22);

    }
}
