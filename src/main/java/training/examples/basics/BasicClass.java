package training.examples.basics;

/**
 * Performs basic operations on text and numbers.
 */
public class BasicClass {

  /**
   * Prints out the given text to the console, and returns the length of the text.
   *
   * @param text the text to be printed and to have its length determined
   * @return the length of the text.
   */
  int printAndReturnLength(String text) {
    System.out.println(text);

    return text.length();
  }


  /**
   * Returns the absolute value of the given number.
   *
   * @param number the number to find the absolute value of
   * @return the absolute value
   */
  int absoluteValue(int number) {
    if (number < 0) {
      return -number;
    } else {
      return number;
    }
  }


  /**
   * The entry point to this program.
   */
  public static void main(String[] args) {
    String text = "here is my text to print and count the length of";

    int lengthOfText = new BasicClass().printAndReturnLength(text);

    System.out.println("Length of text was: " + lengthOfText);

    System.out.println("And did you know that the absolute value of -5 is " + new BasicClass().absoluteValue(-5));
  }

}
