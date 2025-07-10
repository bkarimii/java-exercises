package training.exercises.exercise5;

import static java.lang.String.format;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import training.exercises.ExerciseTest;

/**
 * =====================================
 *  Exercise 5 - Exceptions and Errors
 * =====================================
 * <p>
 * Time to learn what to do if things go wrong in your programs!
 * <p>
 * Here are some exercises about exception and error handling.
 */
public class TestExercise5 extends ExerciseTest {

  /**
   * Let's think again about our Calculator example. When we ask the user for an operation, they
   * should give us one of + - * or /, but they might not! One thing we could do is throw an
   * exception if the operation is invalid.
   * <p>
   * We will write a method to validate an operation and throw an {@link IllegalArgumentException}
   * if it's not valid. This exception type is built-in to the Java language and is a good one to
   * use when the input given to a method is invalid.
   * <p>
   * Have a look at the {@link CalculatorInputProcessor#validateOperation(char)} method and
   * implement it so that it throws an {@link IllegalArgumentException} for invalid operations.
   *
   */
  @Test
  public void testValidateOperationWithValidOperations() {
    CalculatorInputProcessor calculatorInputProcessor = new CalculatorInputProcessor();
    calculatorInputProcessor.validateOperation('+');
    calculatorInputProcessor.validateOperation('-');
    calculatorInputProcessor.validateOperation('*');
    calculatorInputProcessor.validateOperation('/');

    // And now for one that should be invalid. This syntax is a bit different, but we can talk through it!
    assertThrows(IllegalArgumentException.class, () -> calculatorInputProcessor.validateOperation('.'));
  }


  /**
   * It is a bit unfriendly for the user if we just throw an exception every time they give us an
   * invalid operation - especially when the operation is a valid mathematical operation but just
   * isn't supported by our calculator.
   * <p>
   * Let's make some changes so that we can provide some nicer feedback to the user!
   * <p>
   * Firstly, you will notice that there is another exception type in the exercise 5 package called
   * {@link UnimplementedOperationException}. Let's change {@link CalculatorInputProcessor#validateOperation(char)}
   * so that it throws this new exception type when the operation is valid, but just isn't yet
   * implemented by our calculator. The operations that we should consider to be valid but not
   * implemented are % and ^.
   * <p>
   * (It's good practice to update the JavaDoc on the method too to explain the new behaviour.)
   * <p>
   * The next two tests will check that this step has been done.
   */
  @Test(expected = UnimplementedOperationException.class)
  public void testUnimplementedOperationModulo() {
    new CalculatorInputProcessor().validateOperation('%');
  }


  /**
   * ... continuation of above. Make sure both of these tests are passing before moving on.
   */
  @Test(expected = UnimplementedOperationException.class)
  public void testUnimplementedOperationPower() {
    new CalculatorInputProcessor().validateOperation('^');
  }


  /**
   * Next, let's change the {@link CalculatorInputProcessor#processUserInput(char)} method to
   * handle the exceptions from validateOperation more gracefully.
   * <p>
   * If an {@link UnimplementedOperationException} is thrown by the validateOperation method then
   * it should be caught and an apologetic message ("Sorry. Not implemented!") should be printed
   * to the user explaining that our calculator doesn't support that operation yet!
   * <p>
   * If an {@link IllegalArgumentException} is thrown then it should not be caught. That's
   * definitely the user's fault!
   * <p>
   * The next few tests will check that everything is working as expected.
   */
  @Test
  public void testUnimplementedOperationExceptionIsCaught() {
    CalculatorInputProcessor calculatorInputProcessor = new CalculatorInputProcessor();
    calculatorInputProcessor.processUserInput('^');
    calculatorInputProcessor.processUserInput('%');
    checkPrintedOutput(format("Sorry. Not implemented!%nSorry. Not implemented!%n"));
  }


  /**
   * ... continuation of above. Make sure all of the above tests are passing before moving on.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidOperationExceptionIsNotCaught() {
    new CalculatorInputProcessor().processUserInput('#');
  }


  /**
   * ... continuation of above. Make sure all of the above tests are passing before moving on.
   */
  @Test
  public void testValidOperationStillWorks() {
    new CalculatorInputProcessor().processUserInput('+');
  }


  /*
   * BONUS CONTENT
   *
   *  - What happens if we make UnimplementedOperationException extend Exception instead
   *    of RuntimeException?
   *
   *  - What about if it extends Error? Can we still catch it? Should we?
   *
   *  - Try adding a method to UnimplementedOperationException to print the apologetic message
   *    instead of having to put it in the CalculatorInputProcessor class itself.
   *
   *  - If you've finished everything, try updating the Calculator application that we did on day
   *    1 to use exceptions to handle user input errors.
   */
}
