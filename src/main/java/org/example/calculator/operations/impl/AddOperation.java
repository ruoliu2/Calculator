package org.example.calculator.operations.impl;

import org.example.calculator.operations.IOperation;

public class AddOperation implements IOperation {
  @Override
  public double apply(double num1, double num2) {
    return num1 + num2;
  }
}
