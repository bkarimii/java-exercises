package training.exercises.exercise1;

/**
 * Performs more mathematical operations.
 */
class MoreMaths {

  /**
   * Increments the given number by 1 and returns it.
   *
   * @param x the number to increment
   * @return one more than the given number
   */
  int increment(int x) {
    return ++x;
    // return x+1;
  }


  /**
   * Decrements the given number by 1 and returns it.
   *
   * @param x the number to decrement
   * @return one less than the given number
   */
  int decrement(int x) {
    return --x;
    // return x-1;
  }


  /**
   * If the given number is odd, then this method will return double the given number. Otherwise,
   * it will just return the number itself.
   *
   * @param x the number to double if odd
   * @return double the number if it is odd; otherwise just the number itself
   */
  int doubleIfOdd(int x) {
    return x%2!=0 ? 2*x: x;
  }

}
