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

    Map<Integer, Integer> accountNumbersToOpeningBalances = Map.of(
        1, 100,
        2, 10_000,
        3, -500);

    // Do this in an infinite loop so that the application keeps running after a
    // user is finished,
    // and other users can sign in and use the banking application.
    while (true) {
      int accountNumber = UserInput.getInteger("Please enter your account number: ");
      Integer balance = accountNumbersToOpeningBalances.get(accountNumber);
      if (balance != null) {
        System.out.println("Welcome, " + accountNumber + "!");
        System.out.println("This is your balance: " + balance);
      } else {
        System.out.println(
            "\n Account number wasn't found! please eneter a correct banck account number!\n if you don't have an account open one first.");
        continue;
      }

    }
  }
}
