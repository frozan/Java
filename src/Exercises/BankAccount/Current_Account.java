package Exercises.BankAccount;

public class Current_Account extends Bank_Account {
    public static void main(String[] args) {
        Bank_Account account = new Bank_Account();
        account.accountDeposit(500);
        account.accountWithdrawal(200);

    }
}
