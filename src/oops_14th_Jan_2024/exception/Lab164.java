package src.oops_14th_Jan_2024.exception;

import java.io.File;
import java.io.FileInputStream;

public class Lab164 {
    public static void main(String[] args) {

        //Unchecked exception, Runtime
        String name = null;
        name.trim();  // Unchecked? Runtime



        // Checked Exception, Compile time -/JVM If knows about it, Checked Exception

    //    try {
    //        FileInputStream f = new FileInputStream("dask");
    //    }catch (Exception e){
     //       System.out.println("Checked Exception");
     //   }


    }
}
