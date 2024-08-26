package src.oops_14th_Jan_2024.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab168 {
    public static void main(String[] args) {
        try {
            String path = "C:a.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
      //So you can remove exception by file throws method
        // and by using try catch block


    }
}
