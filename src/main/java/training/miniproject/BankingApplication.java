package training.miniproject;

import java.util.Map;

/**
 * An interactive command-line banking application.
 * <p>
 * This will be implemented as part of the mini-project which wraps up the Intro
 * to Java
 * training course.
 * <p>
 * See README.md in this package for instructions!
 */
public class BankingApplication {

  /**
   * The entry point to our command-line banking application.
   */
  public static void main(String[] args) {

    // Map<Integer, Integer> accountNumbersToOpeningBalances = Map.of(
    // 1, 100,
    // 2, 10_000,
    // 3, -500);

    Map<Integer, BankAccount> accountNumbersToOpeningBalances = Map.of(
        1, new BankAccount("John Doe", 100),
        2, new BankAccount("Jane Doe", 10_000),
        3, new BankAccount("Alice Smith", 500)

    );

    BankAccountService bankAccountService = new BankAccountService();

    // Do this in an infinite loop so that the application keeps running after a
    // user is finished,
    // and other users can sign in and use the banking application.
    while (true) {
      int accountNumber = UserInput.getInteger("Please enter your account number: ");
      BankAccount account = accountNumbersToOpeningBalances.get(accountNumber);
      if (account != null) {

        boolean isDone = false;
        Integer balance = account.getBalance();
        String customerName = account.getName();
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("This is your balance: " + balance);

        while (!isDone) {

          System.out.println(
              "How can I help you today?  ");
          String action = UserInput
              .getString(
                  "Enter \n -D to deposite money ,\n -W to withdraw money, \n -F to see future value of your money \n -L to logout of you account");

          if (action.equalsIgnoreCase("D")) {
            boolean isValid = false;
            int depositeAmount;
            while (!isValid) {
              try {
                depositeAmount = UserInput.getInteger("How much do you want to deposite? ");
                bankAccountService.depositeAmount(account, depositeAmount);
                System.out.println("Your balance is: " + account.getBalance());
                isValid = true;
              } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                depositeAmount = UserInput.getInteger("How much do you want to deposite? ");
              }

            }

          } else if (action.equalsIgnoreCase("W")) {
            boolean isValid = false;
            int withdrawAmount;
            while (!isValid) {
              try {
                if (account.getBalance() <= 0) {
                  System.out.println("You don't have any deposit to withdraw.");
                  break;
                }
                withdrawAmount = UserInput.getInteger("How much do you want to withdraw? ");
                bankAccountService.withdrawMoney(account, withdrawAmount);
                System.out.println("Your balance is: " + account.getBalance());
                isValid = true;
              } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Your balance is: " + account.getBalance());
                // withdrawAmount = UserInput.getInteger("How much do you want to withdraw? ");
              }
            }

          } else if (action.equalsIgnoreCase("F")) {
            boolean isValid = false;
            int months = 0;
            while (!isValid) {
              months = UserInput.getInteger("For how long do you want to calc FV of your balance? ");
              if (months <= 0) {
                System.out.println("months can not be less or equal to 0");
              } else if (months > 600) {
                System.out.println("It's too long, months should be less than 600.");
              } else {
                isValid = true;
              }
            }
            double fv = bankAccountService.FV(months, account);
            System.out.println("Future value of your money for " + months + " month will be: " + fv);

          } else if (action.equalsIgnoreCase("L")) {
            isDone = true;
          } else {
            System.out.println("You must enter a valid value");
          }
        }
      } else {
        System.out.println(
            "Account wasn't found! Please Enter a correct account number.\n if you don't have an account with us you need to open one first.");
        continue;
      }
    }
  }
}
