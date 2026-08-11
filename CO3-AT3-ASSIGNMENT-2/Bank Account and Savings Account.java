public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(
            101,
            "Rahul",
            50000,
            6.5
        );
        s.display();
    }
}
class Account {
    int accountNo;
    String holderName;
    double balance;
    Account(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }
}
class SavingsAccount extends Account {
    double interestRate;
    SavingsAccount(int accountNo, String holderName,
                   double balance, double interestRate) {
        super(accountNo, holderName, balance);

        this.interestRate = interestRate;
    }
    void display() {
        double interest = balance * interestRate / 100;
        System.out.println("Account Number : " + accountNo);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Annual Interest: " + interest);
    }
}

