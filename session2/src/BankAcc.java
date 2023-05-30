public class BankAcc {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAcc(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs" + amount);
        System.out.println("New Balance: Rs" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs" + amount);
            System.out.println("New Balance: Rs" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: Rs" + balance);
    }
}

class SavingsAccount extends BankAcc {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest calculated: Rs" + interest);
        System.out.println("New Balance: Rs" + balance);
    }
}

class CheckingAccount extends BankAcc {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs" + amount);
            System.out.println("New Balance: Rs" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
class Main1 {
    public static void main(String[] args) {
        // Create a BankAccount
        BankAcc bankAccount = new BankAcc("BA001", "Pooja", 1000.0);
        System.out.println("Bank Account:");
        bankAccount.displayAccountInfo();
        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        System.out.println();

        // Create a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA001", "Poo", 2000.0, 2.5);
        System.out.println("Savings Account:");
        savingsAccount.displayAccountInfo();
        savingsAccount.deposit(1000.0);
        savingsAccount.calculateInterest();
        savingsAccount.withdraw(500.0);
        System.out.println();

        // Create a CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("CA001", "Hegde", 3000.0, 1000.0);
        System.out.println("Checking Account:");
        checkingAccount.displayAccountInfo();
        checkingAccount.deposit(1500.0);
        checkingAccount.withdraw(4000.0);
    }
}



