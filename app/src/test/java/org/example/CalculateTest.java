package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    int[] test = { 2, 3 };
    Calculate calculate = new Calculate(test);
    int expected = 5;
    assertEquals(expected, calculate.sum());
  }

  @Test
  public void testAvarage() {
    int[] test = { 5, 10 };
    Calculate calculate = new Calculate(test);
    double expected = 7.5;
    assertEquals(expected, calculate.Average(), 0.01);
  }

}
