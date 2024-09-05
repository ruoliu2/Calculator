package org.example.calculator.operations.impl;

import org.example.calculator.operations.IOperation;

public class DivideOperation implements IOperation {
  @Override
  public double apply(double num1, double num2) {
    if (num2 == 0) {
      throw new IllegalArgumentException("Division by zero is not allowed.");
    }
    return num1 / num2;
  }
}
