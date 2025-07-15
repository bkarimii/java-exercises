package training.exercises.exercise4;

/**
 * Prints the allowed values of some enums.
 */
class EnumPrinter {

  /**
   * Prints all the allowed values of the {@link DayOfWeek} enum. One value per line.
   */
  void printDaysOfTheWeek() {
    
    for(DayOfWeek day:DayOfWeek.values()){
      System.out.println(day);
    }
  }

}
