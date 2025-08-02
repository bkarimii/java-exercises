package training.miniproject;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import training.examples.calculator.Calculator;

public class BankAccountService {

    Calculator calculator = new Calculator();

    public void depositeAmount(BankAccount account, int depositAmount) {

        if (depositAmount <= 0) {
            throw new IllegalArgumentException(depositAmount + " is not a valid amount.");
        } else {
            account.setBalance(calculator.calculate(account.getBalance(), depositAmount, '+'));
            if (account.getBalance() >= 0) {
                account.setOverDraftStartDate(null);
            }
            System.out.println(depositAmount + " has been added to your account successfully.");
        }
    }

    public void withdrawMoney(BankAccount account, double withdrawAmount) {

        if (withdrawAmount <= 0) {
            throw new IllegalArgumentException(withdrawAmount + " is not a valid amount.");
        } else {
            double newBalance = account.getBalance() - withdrawAmount;
            if (newBalance < 0 && account.getOverDraftStartDate() == null) {
                account.setOverDraftStartDate(LocalDateTime.now());
            }

            if (newBalance < -account.getOverDraftLimit()) {
                double maxWithdraw = account.getOverDraftLimit() + account.getBalance();
                throw new IllegalArgumentException(
                        " Your account balance is not enough.\n" + maxWithdraw
                                + " is the max amount you can withdraw.");
            } else {
                account.setBalance(calculator.calculate(account.getBalance(), withdrawAmount, '-'));
                System.out.println(withdrawAmount + " withdrew from your account.");
            }

        }
    }

    public double FV(int month, BankAccount account) {

        return calculator.futureValueOfMoney(month, account.getBalance());
    }

    public double calcOverDraftFee(BankAccount account) {
        if (account.getOverDraftStartDate() != null && account.getBalance() < 0) {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime overdraftStart = account.getOverDraftStartDate();

            int monthsInOverdraft = (int) ChronoUnit.MONTHS.between(overdraftStart, now);
            if (monthsInOverdraft < 1)
                monthsInOverdraft = 1;

            double interest = calculator.overDraftFee(
                    monthsInOverdraft,
                    Math.abs(account.getBalance()),
                    account.getOverDraftInterestRate());

            account.setBalance((int) Math.round(account.getBalance() - interest));
            System.out.println("Overdraft interest applied: " + interest);

            account.setOverDraftStartDate(now);
            return interest;
        } else {
            System.out.println("No overdraft fee applied — either balance is positive or overdraft not started.");
            return 0.0;
        }
    }

}
