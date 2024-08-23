package src.oops_14th_Jan_2024.innerclass;

public class Lab153 {
    public static void main(String[] args) {
        OOC occ = new OOC();
        OOC.SNCI icref = new OOC.SNCI(); //in static class OCC ref not needed
        icref.show();
    }

}


class OOC{

    static  int o = 100;
    int a = 900;

    static class SNCI{
        void show(){
            System.out.println(o);
        }
    }

}