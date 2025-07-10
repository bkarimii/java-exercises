package training.exercises.exercise6;

import org.joda.time.LocalDate;
import org.junit.Test;
import training.exercises.ExerciseTest;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * ===============================
 *  Exercise 6 - Dates and Times
 * ===============================
 * <p>
 * We've made it. The last exercise.
 * <p>
 * In this one we will implement some methods for working with dates and times.
 * <p>
 * Date and time logic can get pretty complicated, so most of this exercise is just about learning
 * how to use the JodaTime library effectively so that it does all of the hard work for us!
 */
public class TestExercise6 extends ExerciseTest {

  /**
   * For this first test, you'll need to implement the methods on {@link DateAndTimeCreator} to
   * create the correct dates and times.
   * <p>
   * Take a look at the methods on that class for more detail. You'll need to do them all to pass
   * this test.
   */
  @Test
  public void testCreatingSomeDatesAndTimes() {
    DateAndTimeCreator dateAndTimeCreator = new DateAndTimeCreator();
    assertEquals("Today's date should be correct", LocalDate.now(), dateAndTimeCreator.createToday());
    assertEquals("Christmas day 2021 should be correct", "2021-12-25", dateAndTimeCreator.createChristmasDay2021().toString());
    assertEquals("Midnight new year's day 2000 should be correct", "2000-01-01T00:00:00.000", dateAndTimeCreator.createMidnightOnNewYearsDay2000().toString());
    assertEquals("02:56:00 on 21st July 1969 should be correct", "1969-07-21T02:56:00.000", dateAndTimeCreator.createTwoFiftySixAmOn21July1969().toString());
  }


  /**
   * One thing that we need to do a lot is to compare dates with one another.
   * <p>
   * To practice this, let's implement the {@link DateComparisons#isDate1OnOrAfterDate2(LocalDate, LocalDate)}
   * method that will tell us whether one date is on or after another date.
   * <p>
   * The test below will check your implementation.
   */
  @Test
  public void testDateOnOrAfterAnotherDate() {
    DateComparisons dateComparisons = new DateComparisons();
    assertFalse("4th March 2020 is not on or after 5th March 2020",
        dateComparisons.isDate1OnOrAfterDate2(new LocalDate(2020, 3, 4), new LocalDate(2020, 3, 5)));
    assertTrue("5th March 2020 is on or after 5th March 2020",
        dateComparisons.isDate1OnOrAfterDate2(new LocalDate(2020, 3, 5), new LocalDate(2020, 3, 5)));
    assertTrue("6th March 2020 is on or after 5th March 2020",
        dateComparisons.isDate1OnOrAfterDate2(new LocalDate(2020, 3, 6), new LocalDate(2020, 3, 5)));
  }


  /**
   * A slightly more complicated comparison now.
   * <p>
   * Let's implement {@link DateComparisons#isDate1MoreThanThreeMonthsAndAWeekAfterDate2(LocalDate, LocalDate)}
   * to tell us whether one date is more than 3 months and 1 week after another date.
   */
  @Test
  public void testIsMoreThanThreeMonthsAndAWeekAfter() {
    DateComparisons dateComparisons = new DateComparisons();
    assertFalse("7th September 2021 is not more than three months and a week after 1st June 2021",
        dateComparisons.isDate1MoreThanThreeMonthsAndAWeekAfterDate2(new LocalDate(2021, 9, 7), new LocalDate(2021, 6, 1))
    );
    assertFalse("8th September 2021 is not more than three months and a week after 1st June 2021 (it is exactly 3 months and a week)",
        dateComparisons.isDate1MoreThanThreeMonthsAndAWeekAfterDate2(new LocalDate(2021, 9, 8), new LocalDate(2021, 6, 1))
    );
    assertTrue("9th September 2021 is more than three months and a week after 1st June 2021",
        dateComparisons.isDate1MoreThanThreeMonthsAndAWeekAfterDate2(new LocalDate(2021, 9, 9), new LocalDate(2021, 6, 1))
    );
    assertTrue("1st June is more than three months and a week after 23rd February 2021 - did you add the weeks before the months?",
        dateComparisons.isDate1MoreThanThreeMonthsAndAWeekAfterDate2(new LocalDate(2021, 6, 1), new LocalDate(2021, 2, 23))
    );
    assertFalse("9th September 2020 is not more than three months and a week after 1st June 2021 (wrong year)",
        dateComparisons.isDate1MoreThanThreeMonthsAndAWeekAfterDate2(new LocalDate(2020, 9, 9), new LocalDate(2021, 6, 1))
    );
  }


  /**
   * The last thing that we'll do is implement a method for printing dates in a nice format.
   * <p>
   * Let's implement the {@link DatePrinter#printPrettyDate(LocalDate)} to print a date in the
   * following format:
   * <pre>
   *   Monday, 21 June 2021
   * </pre>
   *
   * Days of the week and months should be written out in full and leading zeros on days should
   * not be printed. A line break should be printed after each date.
   * <p>
   * You might need to look at the documentation on {@link LocalDate#toString(String)} and
   * {@link org.joda.time.format.DateTimeFormat} to work out how to do this.
   */
  @Test
  public void testPrintingDates() {
    DatePrinter datePrinter = new DatePrinter();
    datePrinter.printPrettyDate(new LocalDate(2021, 6, 21));
    datePrinter.printPrettyDate(new LocalDate(2009, 2, 7));
    checkPrintedOutput(format("Monday, 21 June 2021%nSaturday, 7 February 2009%n"));
  }

}
