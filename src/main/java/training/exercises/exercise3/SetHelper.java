package training.exercises.exercise3;

import java.util.HashSet;
import java.util.Set;

/**
 * Helpful methods for dealing with Sets.
 */
class SetHelper {

  /**
   * Returns a Set with three elements. The elements can be of any type.
   *
   * @return a three-element Set.
   */
  Set<Object> createThreeElementSet() {
    Set<Object> setOfNums=new HashSet<>();
    setOfNums.add("1");
    setOfNums.add("null");
    setOfNums.add("Jane");
    return setOfNums;
  }


  /**
   * Returns true if and only if the given set contains zero.
   *
   * @param numbers the set of numbers to check
   * @return true if zero is in the set; false otherwise
   */
  boolean containsZero(Set<Integer> numbers) {
    return numbers.contains(0);
  }

}
