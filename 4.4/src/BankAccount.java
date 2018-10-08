import java.io.*;
import java.util.*;

public class BankAccount implements Comparable<BankAccount> {

    private String AccountNumber;
    private double balance;

    public BankAccount(String aNum, double bal) {
     AccountNumber = aNum;
     balance = bal;
    }

     public String getName(){
            return AccountNumber;
    }

     public double getArea() {
       return balance;
      }

      public int compareTo(BankAccount other) {
        if (balance < other.balance) return -1;
        if (balance > other.balance) return 1;
         return 0;
    }
}
