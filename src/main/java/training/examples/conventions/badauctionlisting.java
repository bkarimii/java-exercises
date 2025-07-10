package training.examples.conventions;

public class badauctionlisting {

  private double AMOUNT; private String Name; public static final boolean Isgood = false; private static final double taxpercentagetouseincalculatingtaxamount = 0.2;

  public badauctionlisting(double amount, String name) { this.AMOUNT = amount; this.Name = name; }
  public double Getamount() { return AMOUNT; }
  public void Setamount(double amount) { this.AMOUNT = amount; }
  public String Getname() { return Name; }
  public void Setname(String name) { this.Name = name; }
  public double tellmewhatthetaxamountisplease() {/* wroks out the tax */ return AMOUNT * taxpercentagetouseincalculatingtaxamount; }
}

