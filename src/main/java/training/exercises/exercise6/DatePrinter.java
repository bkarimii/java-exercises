package training.exercises.exercise6;

// import java.time.format.DateTimeFormatter;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Prints dates in a nice human-readable format.
 */
class DatePrinter {

  /**
   * Prints the given date in the following format:
   * 
   * <pre>
   *   Monday, 21 June 2021
   * </pre>
   *
   * Days of the week and months will be written out in full and leading zeros on
   * days will not
   * be printed. A line break will be printed at the end.
   *
   * @param date the date to print
   */
  void printPrettyDate(LocalDate date) {

    DateTimeFormatter newFormat = DateTimeFormat.forPattern("EEEE, d MMMM yyyy");
    String formatted = newFormat.print(date);
    System.out.println(formatted);

  }

}
