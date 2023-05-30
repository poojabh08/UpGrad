public class BankAccount {
    String accountNumber="safhdsgHJFJSDH";
    String accountHolderName="POOJA";
    float balance=190.8f;

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.displayBalance();
        b.deposit(500);
        b.withdraw(100);
        b.displayBalance();
        b.accountInfo();
    }

    void deposit(int n){
        balance+=n;
        System.out.println("You have deposited Rupees "+ n+"\n"+"Your Balance is "+ balance);
    }

    void withdraw(int n){
        balance-=n;
        System.out.println("You have withdrawn Rupees "+ n+"\n"+"Your Balance is "+ balance);
    }

    void displayBalance(){
        System.out.println("Your account balance is "+balance);
    }

    void accountInfo(){
        System.out.println("Account Number: "+accountNumber+"\n"+ "Account Holder Name: "+ accountHolderName+ "\n"+"Balance: "+balance);
    }

}
