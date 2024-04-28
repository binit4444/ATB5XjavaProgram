package src.basics_06_24Dec;

public class Lab110 {
    public static void main(String[] args) {


        // 1D (One Dimensional Array)
        int a[] = {1,2,3};

        // 2D
        int arr[][] = new int[3][3]; // 3 rows and 3 Columns we have
       int[][] arr2 = new int[3][3];
       // row to col
        // row 0 to 2
        arr[0][0] = 12;
        arr[0][1] = 34;
        arr[0][2] = 25;

        // Initializing 2nd Arrays/2nd Row
        arr[1][0] = 11;
        arr[1][1] = 24;
        arr[1][2] = 15;

        // Initializing 3rd Arrays/2nd Row
        arr[2][0] = 32;
        arr[2][1] = 34;
        arr[2][2] = 30;



        for (int i = 0; i < a.length; i++) {  // First loop basically row
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("-- End of program --");

        // Matrix
        // |1,2,3|
        //  |4,5,6|
        //  |7,8,9|



    }
}
