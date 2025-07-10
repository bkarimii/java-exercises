package training.examples.basics;

/**
 * This is a class.
 * <p>
 * At this point, we can think of a class as a wrapper for related bits of code.
 * <p>
 * We'll see later how we can use classes to create 'objects'.
 */
public class BasicClassExplained {

  /**
   * This is a method (sometimes known as a function). It is a block of code that can be called
   * upon and executed.
   * <p>
   * To call this method, we could write:
   * <pre>
   *   new BasicClass().printAndReturnLength("some text");
   * </pre>
   *
   * Methods can accept parameters that can then be used as variables inside the method. This method
   * accepts a single parameter of type String, meaning that we need to put a String inside the
   * parentheses when we invoke it (see the "some text" bit above).
   * <p>
   * Methods can also have a return value. This allows the method to pass a value back to the code
   * that invoked it. In this case the method returns a value of type 'int' - the length of the
   * String that was passed as a parameter.
   * <p>
   * Methods that do not return anything (for example System.out.println) are said to have a return
   * type of 'void'.
   */
  int printAndReturnLength(String text) {
    // First we call the println method on System.out to print the text
    //
    // If you try to assign the result of this method to a variable then you will get an error
    // because it returns void.
    System.out.println(text);

    // Finally, we return the length of the text to the code that called this method
    return text.length();
  }


  /**
   * This is another method.
   * <p>
   * In this method, we take a number as a parameter (which can be positive or negative), and return its
   * absolute value.
   * <p>
   * To do this, we first check if the number is negative (i.e. less than zero).
   * <p>
   * If it is, then we need to negate it before it can be returned.
   * <p>
   * Else, the number is already non-negative so we just return it.
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
   * Here's a main method so that we can run this class as a Java Application and have a go
   * at invoking the method above.
   */
  public static void main(String[] args) {
    // To declare a variable we first write the type, then the name, then we can use = to assign
    // a value to it.

    // Create a String variable containing some text
    String text = "here is my text to print and count the length of";

    // Then we can call the method above with this String and store the return value in another
    // new variable of type int
    int lengthOfText = new BasicClassExplained().printAndReturnLength(text);

    // Now we could do something with lengthOfText. We could print it, for example, or use it
    // as part of some other calculation.
    //
    // Let's print it along with a label (the + below joins the number to the end of the label)
    System.out.println("Length of text was: " + lengthOfText);

    // Now we call the other method that we've declared on this class to determine and print the
    // absolute value of minus 5.
    System.out.println("And did you know that the absolute value of -5 is " + new BasicClassExplained().absoluteValue(-5));
  }

}
