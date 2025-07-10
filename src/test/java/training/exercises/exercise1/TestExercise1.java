package training.exercises.exercise1;

import org.junit.Test;
import training.exercises.ExerciseTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * ==========================
 *  Exercise 1 - The Basics
 * ==========================
 * <p>
 * This is a collection of exercises that will help us to learn the basic syntax.
 * <p>
 * By the way, this text here is called a 'comment'. It doesn't get executed - it's just here to
 * explain the code. You can put comments in a block like this by starting it with /* or you can
 * put them at the end of a line by using //.
 * <p>
 * This comment is particularly special because it starts with /**, indicating that it is a 'doc
 * comment' and it serves to document the thing that is immediately below it. These comments
 * can be read by an external 'Javadoc' tool and turned into official documentation for the code.
 * <p>
 * Each of the tests below has a similar 'doc comment' explaining what you need to do.
 */
public class TestExercise1 extends ExerciseTest {


  /**
   * Java can perform mathematical operations on numbers. For example:
   * <ul>
   *   <li> + Addition</li>
   *   <li> - Subtraction</li>
   *   <li> * Multiplication</li>
   *   <li> / Division</li>
   * </ul>
   *
   * Let's try implementing {@link Maths#add(int, int)} so that it adds two numbers.
   */
  @Test
  public void testAddition() {
    // Let's get ourselves a new instance of the Maths class so that we can call methods on it
    // (more about this syntax and why this is needed tomorrow)
    Maths maths = new Maths();

    // Now let's run a few tests to make sure the 'add' method works
    assertEquals("1 + 1 should equal 2", 2, maths.add(1, 1));
    assertEquals("3 + 4 should equal 7", 7, maths.add(3, 4));
    assertEquals("5 + -2 should equal 3", 3, maths.add(5, -2));
    assertEquals("9 + 0 should equal 9", 9, maths.add(9, 0));
  }


  /**
   * The next few tests will check the rest of the basic methods on the {@link Maths} class.
   * <p>
   * Next up: {@link Maths#subtract(int, int)}.
   */
  @Test
  public void testSubtraction() {
    Maths maths = new Maths();
    assertEquals("2 - 1 should equal 1", 1, maths.subtract(2, 1));
    assertEquals("4 - 7 should equal -3", -3, maths.subtract(4, 7));
    assertEquals("3 - -2 should equal 5", 5, maths.subtract(3, -2));
    assertEquals("9 - 0 should equal 9", 9, maths.subtract(9, 0));
  }


  /**
   * Next up: {@link Maths#multiply(int, int)}.
   * <p>
   * This one gets a bit trickier once we realise we need to be able to handle large numbers!
   */
  @Test
  public void testMultiplication() {
    Maths maths = new Maths();
    assertEquals("3 * 4 should equal 12", 12, maths.multiply(3, 4));
    assertEquals("5 * -5 should equal -25", -25, maths.multiply(5, -5));
    assertEquals("-3 * -6 should equal 18", 18, maths.multiply(-3, -6));
    assertEquals("10 * 0 should equal 0", 0, maths.multiply(10, 0));

    // Extra check to make sure we can deal with big numbers
    assertEquals("Multiplying two really big numbers should work correctly",
        1000000000000000000L, // Hint: what does the L mean here?
        maths.multiply(1000000000, 1000000000)
    );
  }


  /**
   * Finally: {@link Maths#divide(int, int)}.
   */
  @Test
  public void testDivision() {
    Maths maths = new Maths();
    assertEquals("12/4 should equal 3", 3, maths.divide(12, 4));
    assertEquals("-25/5 should equal -5", -5, maths.divide(-25, 5));
    assertEquals("18/-3 should equal -6", -6, maths.divide(18, -3));
    assertEquals("12/5 should equal 2 (remainder should be ignored)", 2, maths.divide(12, 5));

    // TODO what happens if we try to divide by zero? Uncomment the following line to find out...
    // maths.divide(1, 0);

    // TODO How can we change the 'divide' method so that we can have decimal points in the result?
    //      For example, what types could we use with the method so that the following will pass?
    // assertEquals("Checking divide with a decimal point", 0.5, maths.divide(2.0, 4.0), 0);
  }


  /**
   * Java can also do comparisons between quantities. For example:
   * <ul>
   *   <li> == - Equals</li>
   *   <li> != - Not Equals</li>
   *   <li> < - Less than</li>
   *   <li> > - Greater than</li>
   *   <li> <= - Less than or equal to</li>
   *   <li> >= - Greater than or equal to</li>
   * </ul>
   *
   * There are some methods on the {@link Comparisons} class that you will need to implement to
   * pass the next few tests.
   */
  @Test
  public void testIsPositiveComparison() {
    Comparisons comparisons = new Comparisons();
    assertTrue("1 is positive", comparisons.isPositive(1));
    assertFalse("0 is not positive", comparisons.isPositive(0));
    assertFalse("-1 is not positive", comparisons.isPositive(-1));
  }


  /**
   * For this one we will need to do two comparisons and combine them. Java has the following
   * logical operators to combine booleans:
   * <ul>
   *   <li> && - And</li>
   *   <li> || - Or</li>
   * </ul>
   */
  @Test
  public void testIsInRangeComparison() {
    Comparisons comparisons = new Comparisons();
    assertFalse("3 is not in the range [5,10)", comparisons.isInRange(3, 5, 10));
    assertTrue("5 is in the range [5,10)", comparisons.isInRange(5, 5, 10));
    assertTrue("8 is in the range [5,10)", comparisons.isInRange(8, 5, 10));
    assertFalse("10 is not in the range [5,10)", comparisons.isInRange(10, 5, 10));
    assertFalse("20 is not in the range [5,10)", comparisons.isInRange(20, 5, 10));
    assertTrue("0 is in the range [-3,2)", comparisons.isInRange(0, -3, 2));
  }


  /**
   * Here's another one where you'll need to combine two comparisons.
   */
  @Test
  public void testIsNegativeOrFiveComparison() {
    Comparisons comparisons = new Comparisons();
    assertFalse("4 is not negative", comparisons.isNegativeOrFive(4));
    assertFalse("0 is not negative", comparisons.isNegativeOrFive(0));
    assertTrue("-2 is negative", comparisons.isNegativeOrFive(-2));
    assertTrue("5 is not negative but it is 5!!", comparisons.isNegativeOrFive(5));
    assertTrue("-7 is negative", comparisons.isNegativeOrFive(-7));
  }


  /**
   * Time for some more maths!
   * <p>
   * Take a look at the {@link MoreMaths} class. In the 'increment' and 'decrement' methods
   * we can make use of Java's increment and decrement operators.
   * <p>
   * For example: a++ is shorthand for a = a + 1.
   */
  @Test
  public void testIncrement() {
    MoreMaths moreMaths = new MoreMaths();
    assertEquals("Incrementing 1 should give 2", 2, moreMaths.increment(1));
    assertEquals("Incrementing 2 should give 3", 3, moreMaths.increment(2));
    assertEquals("Incrementing -5 should give -4", -4, moreMaths.increment(-5));
  }


  /**
   * Once you've got 'increment' working, move on to 'decrement'.
   * <p>
   * I'm not going to give you the operator for this but I think you'll be able to work it out!
   */
  @Test
  public void testDecrement() {
    MoreMaths moreMaths = new MoreMaths();
    assertEquals("Decrementing 2 should give 1", 1, moreMaths.decrement(2));
    assertEquals("Decrementing 3 should give 2", 2, moreMaths.decrement(3));
    assertEquals("Decrementing -4 should give -5", -5, moreMaths.decrement(-4));
  }


  /**
   * This next exercise will require you to use an 'if' statement. These can be used to execute
   * different code depending on a specific condition.
   * <p>
   * For example, if we want to print a number only if it is greater than 5, we could do:
   * <pre>
   *   if (a > 5) {
   *     System.out.println(a);
   *   }
   * </pre>
   *
   * You can also add an 'else' block that will be executed only if the condition is false:
   * <pre>
   *   if (a > 5) {
   *     System.out.println(a);
   *   }
   *   else {
   *     System.out.println("Number is too small");
   *   }
   * </pre>
   *
   * Have a go at implementing the {@link MoreMaths#doubleIfOdd} method.
   * <p>
   * Hint: there is one more mathematical operator that we haven't used yet. See if you can find
   * out what it is and how we can use it here.
   */
  @Test
  public void testDoubleIfOdd() {
    MoreMaths moreMaths = new MoreMaths();
    assertEquals("2 should not be doubled because it is not odd", 2, moreMaths.doubleIfOdd(2));
    assertEquals("3 should be doubled because it is odd", 6, moreMaths.doubleIfOdd(3));
    assertEquals("-4 should not be doubled because it is not odd", -4, moreMaths.doubleIfOdd(-4));
    assertEquals("-5 should be doubled because it is odd", -10, moreMaths.doubleIfOdd(-5));
  }


  /**
   * Now it's time to make something a bit more interesting! This problem is part of a classic
   * programming interview question.
   * <p>
   * The game FizzBuzz can be played by a group of people. Each person takes a turn to say a number,
   * but if the number is divisible by 3 they say "Fizz" instead of the number and if it's divisible
   * by 5 they say "Buzz" instead of the number.
   * <p>
   * If it's divisible by both 3 *and* 5 then they say "FizzBuzz".
   * <p>
   * Your goal is to implement the {@link FizzBuzz#takeTurn(int)} method so that it will give the
   * correct FizzBuzz output for a given number.
   * <p>
   * Later on we will use a loop to play the full game!
   */
  @Test
  public void testFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    // Simulate taking 20 turns and check what is printed out
    fizzBuzz.takeTurn(1);
    fizzBuzz.takeTurn(2);
    fizzBuzz.takeTurn(3);
    fizzBuzz.takeTurn(4);
    fizzBuzz.takeTurn(5);
    fizzBuzz.takeTurn(6);
    fizzBuzz.takeTurn(7);
    fizzBuzz.takeTurn(8);
    fizzBuzz.takeTurn(9);
    fizzBuzz.takeTurn(10);
    fizzBuzz.takeTurn(11);
    fizzBuzz.takeTurn(12);
    fizzBuzz.takeTurn(13);
    fizzBuzz.takeTurn(14);
    fizzBuzz.takeTurn(15);
    fizzBuzz.takeTurn(16);
    fizzBuzz.takeTurn(17);
    fizzBuzz.takeTurn(18);
    fizzBuzz.takeTurn(19);
    fizzBuzz.takeTurn(20);
    checkPrintedOutput(String.format("1%n2%nFizz%n4%nBuzz%nFizz%n7%n8%nFizz%nBuzz%n11%nFizz%n13%n14%nFizzBuzz%n16%n17%nFizz%n19%nBuzz%n"));
  }

}

