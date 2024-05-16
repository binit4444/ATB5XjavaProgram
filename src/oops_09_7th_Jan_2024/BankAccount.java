package src.oops_09_7th_Jan_2024;

public class BankAccount {

    String bankName;
    int balance;
    String bankCode;

    BankAccount(){
        bankName = "SBI";
        bankCode = "SBI 001";
        System.out.println("Default C");
    }

  BankAccount(String bName,String bcode){
        this.bankName = bName;
        this.bankCode = bcode;
      System.out.println("Param C");
  }


    void printDetails(){
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal -> " + balance);
    }




}
