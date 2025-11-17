package ClassesAndObjects.bankaccount;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Virat");
        account.depositMoney(100);
        account.withdrawMoney(200);
        account.depositMoney(-40);
        account.withdrawMoney(0);
    }
}
