package oop.Classes;

public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance){
            System.out.println("Insufficient funds for withdrawal.");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal succesful! New balance: $" + balance);
        }
    }

    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {

        // BankAccount object
        BankAccount bankAccount = new BankAccount("Hugo", 150.00);

        // deposit some money
        bankAccount.deposit(100.00);
        // try to withdraw
        bankAccount.withdraw(251.00);

        // display final info
        bankAccount.displayInfo();
    }
}
