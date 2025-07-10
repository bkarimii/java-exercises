package training.exercises.exercise4;

/**
 * A contract where the customer pays weekly rentals.
 */
class WeeklyRentalContract {

  /**
   * The name of the customer.
   */
  private final String customerName;

  /**
   * The weekly payment amount, in pounds.
   */
  private final int weeklyPaymentAmount;

  /**
   * The day of the week on which the customer makes payments.
   */
  private final DayOfWeek paymentDayOfWeek;


  /**
   * Creates a new weekly rental contract with the given parameters.
   *
   * @param customerName the name of the customer
   * @param weeklyPaymentAmount the weekly payment amount in pounds
   * @param paymentDayOfWeek the day of the week on which the customer makes payments
   */
  WeeklyRentalContract(String customerName, int weeklyPaymentAmount, DayOfWeek paymentDayOfWeek) {
    this.customerName = customerName;
    this.weeklyPaymentAmount = weeklyPaymentAmount;
    this.paymentDayOfWeek = paymentDayOfWeek;
  }


  /**
   * Returns the name of the customer.
   */
  String getCustomerName() {
    return customerName;
  }


  /**
   * Returns the weekly payment amount in pounds.
   */
  int getWeeklyPaymentAmount() {
    return weeklyPaymentAmount;
  }


  /**
   * Returns the day of the week on which the customer makes payments.
   */
  DayOfWeek getPaymentDayOfWeek() {
    return paymentDayOfWeek;
  }


  /**
   * Creates a 'standard' contract where the customer pays every Friday.
   *
   * @param customerName the name of the customer
   * @param weeklyPaymentAmount the weekly payment amount in pounds
   * @return a weekly rental contract with the given customer and payment amount and a payment
   * day of the week of Friday.
   */
  static WeeklyRentalContract createStandardContract(String customerName, int weeklyPaymentAmount) {
    // TODO create the standard contract
    return null;
  }

}
