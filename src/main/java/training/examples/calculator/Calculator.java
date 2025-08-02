package training.examples.calculator;

/**
 * Example class: A calculator.
 */
public class Calculator {

  /**
   * Performs the given mathematical operation (+, -, *, /) on the two numbers in
   * the order they are given.
   *
   * @param number1   the first number
   * @param number2   the second number
   * @param operation the mathematical operator
   * @return the result
   */
  public double calculate(double number1, double number2, char operation) {

    switch (operation) {
      case '+':
        return number1 + number2;

      case '-':
        return number1 - number2;

      case '*':
        return number1 * number2;

      case '/':
        // First, check for division by zero
        if (number2 == 0) {
          throw new IllegalArgumentException("Error: Cannot divide by zero.");
        }
        return number1 / number2;

      default:

        throw new IllegalArgumentException("Invalid operation. Must be one of '+', '-', '*', '/'.");
    }

  }

  public double futureValueOfMoney(int months, double P) {

    double i = 0.0425;

    double t = months / 12.0;

    double FV = P * Math.pow(((1 + i)), t);

    return Math.floor(FV * 100) / 100;

  }

  public double overDraftFee(int months, double i, double negativeBalance) {

    double t = months / 12.0;
    return Math.abs(negativeBalance) * Math.pow((1 + i), t) - Math.abs(negativeBalance);
  }
}
