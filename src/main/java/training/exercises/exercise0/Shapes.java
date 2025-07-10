package training.exercises.exercise0;

/**
 * Draws shapes.
 */
class Shapes {

  /**
   * Prints this square:
   * <pre>
   *     ******
   *     *    *
   *     *    *
   *     ******
   * </pre>
   */
  void printASquare() {
    // Use System.out.println to print the square above using '*'s.

    System.out.println("******");
    System.out.println("*    *");
    System.out.println("*    *");
    System.out.println("******");
    
    
  }

  /**
   * Prints a right-angled triangle that is 5 lines tall on the left and
   * is 5 columns wide at the base.
   */
  void printARightAngledTriangle() {
      for(int j=1;j<=5;j++){
        System.out.println("*".repeat(j));
      }
  }

}
