package training.examples.conventions;

/**
 * This is a nicely formatted class.
 *
 */
public class GoodAuctionListing {

  /** How much this class costs. */
  private double amount;

  /** The object's name. */
  private String name;

  /** The tax percentage. */
  private static final double VAT_PERCENTAGE = 0.20;

  /** Is this well formatted? */
  public static final boolean IS_GOOD = true;


  /**
   * Constructor.
   *
   * @param amount how much this is
   * @param name this object's name
   */
  public GoodAuctionListing(double amount, String name) {
    this.amount = amount;
    this.name = name;
  }


  /**
   * Get amount.
   *
   * @return the amount.
   */
  public double getAmount() {
    return amount;
  }


  /**
   * Sets the amount.
   *
   * @param amount the new amount to set
   */
  public void setAmount(double amount) {
    this.amount = amount;
  }


  /**
   * Get name.
   *
   * @return the name.
   */
  public String getName() {
    return name;
  }


  /**
   * Sets the name.
   *
   * @param name the new name to set
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Returns the tax amount calculated by multiplying amount by VAT.
   *
   * @return the tax amount
   */
  public double calculateTaxAmount() {
    return amount * VAT_PERCENTAGE;
  }
}

