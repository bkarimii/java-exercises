package training.exercises.exercise1;

/**
 * Implementation of the game 'FizzBuzz'.
 */
class FizzBuzz {

  /**
   * Prints the output for the given number according to the rules of FizzBuzz, which are:
   * <ul>
   *   <li>If the number is not divisible by 3 or 5, just print it.</li>
   *   <li>If the number is divisible by 3 but not 5, print Fizz.</li>
   *   <li>If the number is divisible by 5 but not 3, print Buzz.</li>
   *   <li>If the number is divisible by 3 and 5, print FizzBuzz.</li>
   * </ul>
   *
   * @param number the number for which to print the output
   */
  void takeTurn(int number) {
    System.out.println(number);
    if(number %3==0 && number%5==0){
      System.out.println("FizzBuzz");
    }else if(number%3==0 && number%5!=0){
      System.out.println("Fizz");
    }else if(number%3!=0 && number%5==0){
      System.out.println("Buzz");
    }else{
      System.out.println(number);
    }
  }

}
