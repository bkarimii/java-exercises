package training.exercises.exercise6;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
// import java.time.LocalDate;
// import java.time.LocalDateTime;

/**
 * Methods for creating some specific dates and times.
 */
class DateAndTimeCreator {

  /**
   * Returns today's date.
   */
  LocalDate createToday() {
    return LocalDate.now();
  }

  /**
   * Returns Christmas Day (25th December) 2021.
   */
  LocalDate createChristmasDay2021() {
    // LocalDate chirstmasDay2021 = new LocalDate.of(2021, 12, 25);
    LocalDate chirstmasDay2021 = new LocalDate(2021, 12, 25);

    return chirstmasDay2021;
  }

  /**
   * Returns midnight on new year's day 2000.
   */
  LocalDateTime createMidnightOnNewYearsDay2000() {
    LocalDateTime midnight2000 = new LocalDateTime(2000, 1, 1, 0, 0);
    return midnight2000;
  }

  /**
   * Returns 02:56:00 on 21st July 1969.
   */
  LocalDateTime createTwoFiftySixAmOn21July1969() {
    // LocalDateTime year1969 = new LocalDateTime.of(1969, 07, 21, 2, 56, 00);
    LocalDateTime year1969 = new LocalDateTime(1969, 7, 21, 2, 56, 0);
    // LocalDateTime year1969 = new LocalDateTime(1969, 7, 21, 2, 56, 00);

    return year1969;
  }

}
