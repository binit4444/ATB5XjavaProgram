package src.oops_14th_Jan_2024.innerclass;

public class Lab155 {
    public static void main(String[] args) {
        // Anonymous class
        Student s1 = new Student() {
            @Override
            public void setId() {

            }
        };
        // calling the function using anonymous calss
        s1.setId();

        // calling the function after implementing the function
     //   NoName s2 = new NoName();
     //   s2.setId();
        // Anonymous class no Name
        B b = new B() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };

    }
}


abstract class B{
    int var_b = 12;
}

interface Student{
    int id = 11;
    void setId();
}

 // class NoName implements Student{

    // @Override
  //  public void setId() {
  //      System.out.println("Function implemented");
  //  }
  //   }

