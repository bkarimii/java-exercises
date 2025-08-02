package training.miniproject;

import training.examples.calculator.Calculator;

public class BankAccountService {

    Calculator calculator = new Calculator();

    public void depositeAmount(BankAccount account, int depositAmount) {

        if (depositAmount <= 0) {
            throw new IllegalArgumentException(depositAmount + " is not a valid amount.");
        } else {
            account.setBalance(calculator.calculate(account.getBalance(), depositAmount, '+'));
            System.out.println(depositAmount + " has been added to your account successfully.");
        }
    }

    public void withdrawMoney(BankAccount account, int withdrawAmount) {

        if (withdrawAmount <= 0) {
            throw new IllegalArgumentException(withdrawAmount + " is not a valid amount.");
        } else {
            int newBalance = account.getBalance() - withdrawAmount;
            if (newBalance < 0) {
                throw new IllegalArgumentException(" Your account balance is not enough.");
            } else {
                account.setBalance(calculator.calculate(account.getBalance(), withdrawAmount, '-'));
                System.out.println(withdrawAmount + " withdrew from your account.");
            }

        }
    }

    public double FV(int month, BankAccount account) {

        return calculator.futureValueOfMoney(month, account.getBalance());
    }
}
