package codeAcademyJava.Project;

public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }
    public void deposit(int amountToDeposit){
        balance = amountToDeposit + balance;
        System.out.println("You just deposited "+ amountToDeposit);
    }
    public void withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
    }


    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(300);

        //Check balance:
        savings.checkBalance();

        // Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

    }
}
