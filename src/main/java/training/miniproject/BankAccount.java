package training.miniproject;

public class BankAccount {

    private String name;
    private int balance;
    private int pin;
    private int overDraft;

    public BankAccount(String name, int balance, int pin, int overDraft) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.overDraft = overDraft;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getPin() {
        return this.pin;
    }

    public int getOverDraft() {
        return overDraft;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

}
