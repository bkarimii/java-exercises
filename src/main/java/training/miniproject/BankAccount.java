package training.miniproject;

import java.time.LocalDateTime;

public class BankAccount {

    private String name;
    private double balance;
    private int pin;
    private int overDraftLimit;
    private double overDraftInterestRate;
    private LocalDateTime overdraftStartDate;

    public BankAccount(String name, int balance, int pin, int overDraftLimit, double overDraftInterestRate) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.overDraftLimit = overDraftLimit;
        this.overDraftInterestRate = overDraftInterestRate;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return this.pin;
    }

    public int getOverDraftLimit() {
        return overDraftLimit;
    }

    public double getOverDraftInterestRate() {
        return overDraftInterestRate;
    }

    public LocalDateTime getOverDraftStartDate() {
        return this.overdraftStartDate;
    }

    public void setOverDraftInterestrate(double overDraftInterestRate) {
        this.overDraftInterestRate = overDraftInterestRate;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void setOverDraftStartDate(LocalDateTime startDate) {
        this.overdraftStartDate = startDate;
    }

}
