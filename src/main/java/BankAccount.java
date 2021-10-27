public class BankAccount {
    // Instance variables

    private int balance;
    private int accountNumber;
    private String preferredName;

    public BankAccount(int bal, int num, String pref){
        balance = bal;
        accountNumber = num;
        preferredName = pref;
    }

    public void withdraw(int x){
        if(balance > x){
            balance = balance - x;
            System.out.println("Your new balance is $" + balance);
        }
        else{
            System.out.println("You don't have enough money for that transaction");
        }
    }

    public void deposit(int y){
        balance = balance + y;
        System.out.println("Your new balance is $" + balance);

    }

    public int getBalance(){

        return balance;
    }

    public int getAccountNumber(){

        return accountNumber;
    }

    public String getPreferredName(){

        return preferredName;
    }

    public void setPreferredName(String name2){

        preferredName = name2;
    }

    public String toString(String b){
        b = "Your bank account number is " + accountNumber + " and you balance is $" + balance;

        return b;
    }



}