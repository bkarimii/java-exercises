package training.exercises.exercise1;

/**
 * Compares some things.
 */
class Comparisons {

  /**
   * Returns true if and only if the given number is positive.
   *
   * @param number the number to check
   * @return true if the number is positive; false otherwise
   */
  boolean isPositive(int number) {
    return number>0;
  }


  /**
   * Returns true if and only if the given number lies within the given range.
   *
   * @param number the number to check
   * @param startOfRangeInclusive the start of the range (inclusive)
   * @param endOfRangeExclusive the end of the range (exclusive)
   * @return true if the number is in the range; false otherwise
   */
  boolean isInRange(int number, int startOfRangeInclusive, int endOfRangeExclusive) {
    return (number>=startOfRangeInclusive && number<endOfRangeExclusive);
  }


  /**
   * Returns true if and only if the given number is negative or is exactly 5.
   *
   * @param number the number to check
   * @return true if the number is negative or 5; false otherwise
   */
  boolean isNegativeOrFive(int number) {
    return (number<0 || number==5);
  }

}
