package training.examples.calculator;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link Calculator}.
 */
public class TestCalculator {


  @Test
  public void testAddingTwoPositiveNumbers() {
    assertEquals("2 + 8 should equal 10", 10, new Calculator().calculate(2, 8, '+'));
  }


  @Test
  public void testAddingNegativeNumberToPositiveNumber() {
    assertEquals("-8 + 2 should equal -6", -6, new Calculator().calculate(-8, 2, '+'));
  }


  @Test
  public void testSubtractingTwoPositiveNumbers() {
    assertEquals("8 - 10 should equal -2", -2, new Calculator().calculate(8, 10, '-'));
  }


  @Test
  public void testSubtractingTwoNegativeNumbers() {
    assertEquals("-8 - (-10) should equal 2", 2, new Calculator().calculate(-8, -10, '-'));
  }


  @Test
  public void testMultiplyingTwoPositiveNumbers() {
    assertEquals("9 * 7 should equal 63", 63, new Calculator().calculate(9, 7, '*'));
  }


  @Test
  public void testMultiplyingTwoBigNumbers() {
    assertEquals("1000000000 * 1000000000 should equal 1000000000000000000", 1000000000000000000L, new Calculator().calculate(1000000000, 1000000000, '*'));
  }


  @Test
  public void testDivision() {
    assertEquals("30 / 6 should equal 5", 5, new Calculator().calculate(30, 6, '/'));
  }
}