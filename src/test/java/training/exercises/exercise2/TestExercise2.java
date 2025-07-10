package training.exercises.exercise2;

import org.junit.Test;
import training.exercises.ExerciseTest;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

/**
 * =====================
 *  Exercise 2 - Loops
 * =====================
 * <p>
 * In this exercise we'll learn how to use loops to execute sections of code repeatedly.
 * <p>
 * You'll need to edit the classes in the training.exercises.exercise2 package to pass these tests.
 */
public class TestExercise2 extends ExerciseTest {

  /**
   * First let's try using a 'while' loop. Implement the {@link Loops#countUpTo(int)} method using
   * a 'while' loop so that it prints the numbers from 1 up to a given number. One number per line.
   */
  @Test
  public void testCountingWithWhileLoop() {
    new Loops().countUpTo(10);
    checkPrintedOutput(format("1%n2%n3%n4%n5%n6%n7%n8%n9%n10%n"));
  }


  /**
   * Now try changing your implementation of {@link Loops#countUpTo(int)} to use a 'for' loop
   * instead. The above test should still pass, and so should this one!
   */
  @Test
  public void testCountingWithForLoop() {
    new Loops().countUpTo(15);
    checkPrintedOutput(format("1%n2%n3%n4%n5%n6%n7%n8%n9%n10%n11%n12%n13%n14%n15%n"));
  }


  /**
   * What if we want to count in multiples? e.g. 2, 4, 6, etc..
   * <p>
   * Try implementing the {@link Loops#countInMultiples(int, int)} method using a loop.
   */
  @Test
  public void testCountingInMultiples() {
    Loops loops = new Loops();
    loops.countInMultiples(3, 15);
    loops.countInMultiples(2, 20);
    checkPrintedOutput(format("3%n6%n9%n12%n15%n2%n4%n6%n8%n10%n12%n14%n16%n18%n20%n"));
  }


  /**
   * Now that we know how to write loops, let's use them to calculate something. Let's implement
   * the {@link Loops#sumOfSquares(int)} method to calculate the sum of the first n square numbers.
   */
  @Test
  public void testSummingSquares() {
    Loops loops = new Loops();
    assertEquals("Sum of the first 0 square numbers is 0", 0, loops.sumOfSquares(0));
    assertEquals("Sum of the first 1 square numbers is 1", 1, loops.sumOfSquares(1));
    assertEquals("Sum of the first 10 square numbers is 385", 385, loops.sumOfSquares(10));
  }


  /**
   * One more numbers-based exercise.This time let's work out the mean average of the first n
   * natural numbers. For example, the average of the numbers 1 to 10 is:
   * (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10) / 10 = 5.5
   * <p>
   * Implement the {@link Loops#average(int)} method to do this.
   */
  @Test
  public void testAveraging() {
    Loops loops = new Loops();
    assertEquals("Average of 1 to 10 is 5.5", 5.5, loops.average(10), 0.001);
    assertEquals("Average of 1 to 20 is 11.5", 10.5, loops.average(20), 0.001);
  }


  /**
   * While in a loop, you can use the 'break' keyword to leave the loop early.
   * <p>
   * Let's implement the {@link Loops#maybeBreakAtTen(int, boolean)} method that counts up to a
   * certain number but always stops at 10 if the second argument is true!
   */
  @Test
  public void testBreaking() {
    Loops loops = new Loops();
    loops.maybeBreakAtTen(15, false);
    loops.maybeBreakAtTen(15, true);
    checkPrintedOutput(format("1%n2%n3%n4%n5%n6%n7%n8%n9%n10%n11%n12%n13%n14%n15%n1%n2%n3%n4%n5%n6%n7%n8%n9%n10%n"));
  }


  /**
   * Another keyword you can use inside a loop is 'continue'. This will stop the *current* iteration
   * of the loop and will continue straight onto the next one - good for skipping out a single go
   * of the loop!
   * <p>
   * For this test, implement the {@link Loops#countToTenSkipping(int)} to count from 1 to 10 but
   * skip out a given number.
   */
  @Test
  public void testContinuing() {
    Loops loops = new Loops();
    loops.countToTenSkipping(3);
    loops.countToTenSkipping(7);
    checkPrintedOutput(format("1%n2%n4%n5%n6%n7%n8%n9%n10%n1%n2%n3%n4%n5%n6%n8%n9%n10%n"));
  }


  /*
   * BONUS CONTENT
   *
   * - Update your Shapes class from Exercise 0 to use a loop to print the triangle. Change the
   *   method so it can take an argument for the height/width of the triangle.
   *
   * - Add a method to your FizzBuzz class to make it play the game and print the output up to
   *   a given number.
   */
}

