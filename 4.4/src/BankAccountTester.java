import java.io.*;
import java.util.*;

public class BankAccountTester {
    public static void main(String[] args) {
        ArrayList<BankAccount> BankAccounts = new ArrayList<BankAccount>();
        BankAccounts.add(new BankAccount("101", 1500));
        BankAccounts.add(new BankAccount("102", 1000));
        BankAccounts.add(new BankAccount("103", 500));
        Collections.sort(BankAccounts);
        // Now the array list is sorted by area
        for (BankAccount c : BankAccounts) {
            System.out.println(c.getName() + " " + c.getArea());
        }
    }
}
