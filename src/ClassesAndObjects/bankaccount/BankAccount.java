package ClassesAndObjects.bankaccount;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit Amount");
        } else {
            balance += money;
            System.out.printf("Amount : %f Deposited Successfully", money);
            System.out.println();
        }
    }
    public void withdrawMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else {
            if (money <= balance) {
                balance -= money;
                System.out.printf("Withdrawal of Amount : %f Success", money);
                System.out.println();
            } else {
                System.out.println("Low Bank Balance, Withdrawal failed");
            }
        }
    }
}