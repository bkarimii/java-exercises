package training.exercises.exercise0;

import static java.lang.String.format;

import org.junit.Test;

import training.exercises.ExerciseTest;

/**
 * ========================
 *  How the exercises work
 * ========================
 * <p>
 * For each exercise, you will need to look in two folders:
 * <p>
 *  - src/main/java/training/exercises/exerciseX - this will contain the files that you need to
 *    edit to complete the tasks in exercise X.
 * <p>
 *  - src/test/java/training/exercises/exerciseX - this will contain a file with instructions for
 *    exercise X (like this file you're reading now) and some tests to check your solutions. You
 *    should not need to edit these files but feel free to add extra tests if you want to!
 * <p>
 * In the test files, you can run each test method individually by right-clicking on it and running
 * it as a JUnit test.
 * <p>
 * Running the test class itself (e.g. by right-clicking on the class name and selecting Run) will
 * run *all* the methods -- useful for checking at the end that you've got everything working!
 */


public class TestExercise0 extends ExerciseTest {
  /**
   * Here's your first test.
   * <p>
   * To pass this test, you will need to make the {@link Shapes#printASquare()} method print a
   * square made of *'s that looks like this:
   *
   * <pre>
   *     ******
   *     *    *
   *     *    *
   *     ******
   * </pre>
   *
   * Hint: you can CTRL+click on the method name link above to go straight to the method you
   * need to change.
   * <p>
   * Right-click on the test name (testPrintingASquare) below and run it as a JUnit test.
   * <p>
   * It should fail right now, but that's fine! Once you've implemented the printASquare method
   * then it will pass.
   */
  @Test
  public void testPrintingASquare() {
    // Here we are running the 'printASquare' method on the 'Shapes' class.
    new Shapes().printASquare();

    // Now we can check what it printed. Was it correct?
    checkPrintedOutput(format("******%n*    *%n*    *%n******%n"));
  }


  /**
   * How about a right-angled triangle? Let's implement the {@link Shapes#printARightAngledTriangle}
   * method.
   * <p>
   * The triangle should be 5 lines tall on the left and be 5 columns wide at the base.
   * <p>
   * If you're not sure what it should look like, try running the test and looking at the 'expected'
   * output when it fails.
   */
  @Test
  public void testPrintingARightAngledTriangle() {
    new Shapes().printARightAngledTriangle();
    checkPrintedOutput(format("*%n**%n***%n****%n*****%n"));
  }
}
