package src.oops_09_7th_Jan_2024.inheritance;

public class Java extends Programming {

    String newfeature;

    Java(){
        System.out.println("Java DC");
    }

    Java(String  feature){
        this.newfeature = feature;
    }

    void printInfo(){
        System.out.println("Feature is -> " + this.newfeature);
        System.out.println("Author is -> " + this.author);
    }

}
