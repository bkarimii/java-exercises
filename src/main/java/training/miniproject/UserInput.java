package training.miniproject;

import java.util.Scanner;

/**
 * Utility methods for accepting user input.
 */
final class UserInput {

  private UserInput() {}


  /**
   * Prints the given prompt and then waits for the user to enter some input. Returns the user input.
   *
   * @param prompt the prompt to show
   * @return the String that was input by the user - may be empty if the user did not enter anything
   */
  static String getString(String prompt) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(prompt);
    System.out.print("> ");
    if (scanner.hasNextLine()) {
      return scanner.nextLine();
    }
    throw new RuntimeException("Something went wrong reading user input.");
  }


  /**
   * Prints the given prompt and then waits for the user to enter an integer input. Returns the user
   * input if it can be interpreted as an integer. If the input cannot be interpreted as an integer,
   * keeps prompting the user until they enter a valid integer, then returns the valid input.
   *
   * @param prompt the prompt to show
   * @return the integer that was input by the user
   */
  static int getInteger(String prompt) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(prompt);
    System.out.print("> ");
    if (scanner.hasNext()) {
      if (scanner.hasNextInt()) {
        return scanner.nextInt();
      }
      return getInteger(prompt);
    }
    throw new RuntimeException("Something went wrong reading user input.");
  }

}
