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
        3, new BankAccount("Alice Smith", -500)

    );

    // Do this in an infinite loop so that the application keeps running after a
    // user is finished,
    // and other users can sign in and use the banking application.
    while (true) {
      int accountNumber = UserInput.getInteger("Please enter your account number: ");
      BankAccount account = accountNumbersToOpeningBalances.get(accountNumber);
      if (account != null) {
        Integer balance = account.getBalance();
        String customerName = account.getName();

        System.out.println("Welcome, " + customerName + "!");
        System.out.println("This is your balance: " + balance);
        // ================================================================
        System.out.println(
            "Do you want to withdraw or deposite money into your account? ");
        String depOrWithDraw = UserInput.getString("Enter -D for deposite money , or -W to withdraw money.");
        if (depOrWithDraw.equalsIgnoreCase("D")) {
          int depositeAmount = UserInput.getInteger("How much do you want to deposite? ");
        } else if (depOrWithDraw.equalsIgnoreCase("W")) {
          int withdrawAmount = UserInput.getInteger("How much do you want to deposite? ");

        } else {
          System.out.println("You must enter a valid value");
        }
      } else {
        System.out.println(
            "Account wasn't found! Please Enter a correct account number.\n if you don't have an account with us you need to open one first.");
        continue;
      }

    }
  }
}
