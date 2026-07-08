package Inheritance;
// create a class bank account with methods deposit and withdraw , derive a class savings account 
// ---that acts on interest rate method and calculate interest.

class BankAccount {
    double balance = 1000;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 5;

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest = " + interest);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

        s.deposit(500);
        s.withdraw(200);

        System.out.println("Balance = " + s.balance);

        s.calculateInterest();
    }
}