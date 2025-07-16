package training.exercises.exercise5;


/**
 * Processes input to the calculator.
 */
public class CalculatorInputProcessor {

  /**
   * Checks that the given operation is a valid calculator operation. If it is not then
   * an {@link IllegalArgumentException} will be thrown.
   *
   * Valid operations are: + - * /
   *
   * @param operation the operation to check
   * @throws IllegalArgumentException if the operation is invalid
   */
  public void validateOperation(char operation) {

    if(operation=='^' || operation=='%'){
      throw new UnimplementedOperationException();
    }else if((operation!='+' && operation!='-' && operation!='*' && operation!='/')){
        throw new IllegalArgumentException();
    }
  }


  /**
   * Processes the operation that has been input by the user. If the operation is invalid then
   * an exception will be thrown. If the operation is valid but is not implemented by this
   * calculator then "Sorry. Not implemented!" will be printed.
   *
   * @param userInput the operation that the user has input
   * @throws IllegalArgumentException if the operation is invalid
   */
  void processUserInput(char userInput) {
     // TODO catch the UnimplementedOperationException
    try {
      validateOperation(userInput);
    } catch (UnimplementedOperationException e) {
      System.out.println("Sorry. Not implemented!");
    }

  }


  /**
   * Processes the user input as per {@link #processUserInput(char)} and then prints 'Goodbye'.
   *
   * @param userInput the user input to process
   */
  void processUserInputAndSayBye(char userInput) {
     // TODO say 'Goodbye' even if this line throws an exception

    try {
      processUserInput(userInput);
    } finally{
      System.out.println("Goodbye");
    }
  }

}
