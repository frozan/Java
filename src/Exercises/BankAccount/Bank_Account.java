package Exercises.BankAccount;

public class Bank_Account {

    public double balance;

    public Bank_Account() {
        balance = 0;
    }
    public Bank_Account(double amount) {
        balance = amount;
    }

    public double accountDeposit(double amount) {
        balance += amount;
        System.out.println("Your balance is: "+balance);
        return amount;
    }
    public boolean accountWithdrawal(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("You have insufficient funds!");
            return false;
        }
        else {
            balance -= withdrawAmount;
            System.out.println("Amount withdrew is: " + withdrawAmount);
            System.out.println("Account balance is: " + balance);
            return true;
        }
    }

}
