package org.example.calculator;

import java.util.Map;
import org.example.calculator.enums.Operation;
import org.example.calculator.operations.IOperation;

public class Calculator {
  private final Map<Operation, IOperation> operations;
  private double result;

  // Constructor for IoC compatibility, enabling dependency injection of operations
  public Calculator(Map<Operation, IOperation> operations) {
    this.operations = operations;
  }

  // Basic calculation method
  public double calculate(Operation op, double num1, double num2) {
    IOperation operation = operations.get(op);
    if (operation == null) {
      throw new UnsupportedOperationException("Operation not supported: " + op);
    }
    return operation.apply(num1, num2);
  }

  // Chaining calculation method
  public Calculator chainingCalculate(Operation op, double num) {
    this.result = calculate(op, this.result, num);
    return this;
  }

  // Initialize result
  public Calculator withInitialValue(double initialValue) {
    this.result = initialValue;
    return this;
  }

  // Get the final result
  public double getResult() {
    return this.result;
  }
}
