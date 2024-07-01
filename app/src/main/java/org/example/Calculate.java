package org.example;

public class Calculate {
  int[] values;

  public Calculate(int[] values) {
    this.values = values;
  }

  public int sum() {
    int sum = 0;

    for (int i = 0; i < this.values.length; i++) {
      sum += values[i];
    }

    return sum;
  }

  public double Average() {
    return (double) sum() / this.values.length;
  }

}
