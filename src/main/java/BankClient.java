import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
//        // Create a bank account with a balance of 0, the account number 101134, and the given name
//        BankAccount account = new BankAccount(0, 101134, name);
        BankAccount account = new BankAccount(123789, 90123 ,name);
        account.deposit(100);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getPreferredName());
        account.setPreferredName("Daquavious");
        System.out.println(account.getPreferredName());
        System.out.println(account.toString());


    }
}
