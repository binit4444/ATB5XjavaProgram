package src.oops_09_7th_Jan_2024.inheritance;

public class Programming {

    int version;
    String author;

    Programming(){
        System.out.println("Programming DC");
    }

    Programming(String author,int version){
        this.author = author;
        this.version = version;
    }

    void printInfo(){
        System.out.println("Program Info -> " + " version -> " + this.version + " author -> " + this.author);
    }

    void car(){
        System.out.println(" BMW ");
    }


}
