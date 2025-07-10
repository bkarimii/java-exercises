package training.exercises.exercise4;

import org.junit.Test;
import training.exercises.ExerciseTest;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * =====================
 *  Exercise 4 - Enums
 * =====================
 * <p>
 * Enums are a special kind of Java type that allow variables to be set to one of a set of
 * predefined constants.
 * <p>
 * In this exercise we will have a go at creating our own enum and we will see some of the
 * things that you can do with them.
 */
public class TestExercise4 extends ExerciseTest {

  /**
   * In the training.exercises.exercise4 package you will find an enum called {@link DayOfWeek}.
   * At the moment, it doesn't have any allowed values.
   * <p>
   * To pass this test you will need to add constants to the enum to represent each day of the
   * week. You will need to make sure they are in the correct order and that Monday is first.
   * <p>
   * Remember that according to the coding conventions, constants are always in UPPERCASE.
   */
  @Test
  public void testCreateEnum() {
    assertEquals("There should be 7 days of the week", 7, DayOfWeek.values().length);
    assertEquals("Monday should be day 1", 0, DayOfWeek.valueOf("MONDAY").ordinal());
    assertEquals("Tuesday should be day 2", 1, DayOfWeek.valueOf("TUESDAY").ordinal());
    assertEquals("Wednesday should be day 3", 2, DayOfWeek.valueOf("WEDNESDAY").ordinal());
    assertEquals("Thursday should be day 4", 3, DayOfWeek.valueOf("THURSDAY").ordinal());
    assertEquals("Friday should be day 5", 4, DayOfWeek.valueOf("FRIDAY").ordinal());
    assertEquals("Saturday should be day 6", 5, DayOfWeek.valueOf("SATURDAY").ordinal());
    assertEquals("Sunday should be day 7", 6, DayOfWeek.valueOf("SUNDAY").ordinal());
  }


  /**
   * Now let's see how we can use your enum in another class. Take a look at the
   * {@link WeeklyRentalContract} class. It represents a contract where a customer pays weekly
   * rentals. Each contract can have a different payment day of the week, which we store in the
   * {@code dayOfWeek} field using your new enum type.
   * <p>
   * You will notice that the {@link WeeklyRentalContract#createStandardContract(String, int)}
   * method has not yet been implemented. For this finance company, their 'standard' contracts
   * always have a payment day of Friday. Let's implement the method so that it creates a contract
   * with the right payment day.
   * <p>
   * Once you've done that, this test should pass.
   */
  @Test
  public void testUsingTheEnum() {
    WeeklyRentalContract mattsContract = WeeklyRentalContract.createStandardContract("Matt", 1000);
    assertEquals("Customer name should be correct", "Matt", mattsContract.getCustomerName());
    assertEquals("Payment amount should be correct", 1000, mattsContract.getWeeklyPaymentAmount());
    assertEquals("Payment day of the week should be correct", "FRIDAY", mattsContract.getPaymentDayOfWeek().name());

    WeeklyRentalContract tonysContract = WeeklyRentalContract.createStandardContract("Tony", 1200);
    assertEquals("Customer name should be correct", "Tony", tonysContract.getCustomerName());
    assertEquals("Payment amount should be correct", 1200, tonysContract.getWeeklyPaymentAmount());
    assertEquals("Payment day of the week should be correct", "FRIDAY", tonysContract.getPaymentDayOfWeek().name());
  }


  /**
   * Sometimes it can be useful to loop over all the allowed values of an enum. For example, we
   * might want to print out all the days of the week.
   * <p>
   * Let's implement the {@link EnumPrinter#printDaysOfTheWeek()} method to loop over all the
   * allowed values of DayOfWeek and print them one per line.
   * <p>
   * Use this test to check your output.
   */
  @Test
  public void testPrintingEnumValues() {
    new EnumPrinter().printDaysOfTheWeek();
    checkPrintedOutput(format("MONDAY%nTUESDAY%nWEDNESDAY%nTHURSDAY%nFRIDAY%nSATURDAY%nSUNDAY%n"));
  }


  /**
   * Enums can have behaviour. In other words, they can have methods! You may have spotted the
   * {@link DayOfWeek#isWeekend()} method already.
   * <p>
   * Let's implement it to tell us whether each day of the week is part of the weekend or not.
   * <p>
   * In order to do this we'll have to store some state on the enum too. Can you work out how
   * to do that?
   */
  @Test
  public void testEnumBehaviour() {
    assertFalse("Monday is a weekday", DayOfWeek.valueOf("MONDAY").isWeekend());
    assertFalse("Tuesday is a weekday", DayOfWeek.valueOf("TUESDAY").isWeekend());
    assertFalse("Wednesday is a weekday", DayOfWeek.valueOf("WEDNESDAY").isWeekend());
    assertFalse("Thursday is a weekday", DayOfWeek.valueOf("THURSDAY").isWeekend());
    assertFalse("Friday is a weekday", DayOfWeek.valueOf("FRIDAY").isWeekend());
    assertTrue("Saturday is part of the weekend", DayOfWeek.valueOf("SATURDAY").isWeekend());
    assertTrue("Sunday is part of the weekend", DayOfWeek.valueOf("SUNDAY").isWeekend());
  }


  /*
   * BONUS CONTENT
   *
   *  - Imagine that the finance company has decided that they won't accept payments at the
   *    weekend, and therefore any contract created with a payment day at the weekend should
   *    instead have the payment day set to Monday. Can you change the constructor for the
   *    WeeklyRentalContract class to do this, using your new isWeekend method on the enum?
   *
   *  - Perhaps try writing a test first to define the expected behaviour, then change the
   *    constructor to pass your new test.
   */
}
