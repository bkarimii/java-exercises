package training.exercises.exercise3;

import java.util.List;

/**
 * Methods for performing maths with lists.
 */
class ListMaths {

  /**
   * Returns the sum of all the numbers in the given list.
   *
   * @param numbers the list of numbers to sum
   * @return the sum of all numbers in the list
   */
  int sum(List<Integer> numbers) {
    int sum=0;
    for(Integer num:numbers){
      sum+=num;
    }

    return sum;
  }


  /**
   * Returns the mean average of all the numbers in the given list.
   *
   * @param numbers the list of numbers to average
   * @return the mean average of all numbers in the list
   */
  double average(List<Double> numbers) {
    
    double sum=0;
    for(Double num:numbers){
      sum+=num;
    }
    return sum/(numbers.size());
  }
}
