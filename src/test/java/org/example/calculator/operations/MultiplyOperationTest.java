package org.example.calculator.operations;

import static org.junit.jupiter.api.Assertions.*;

import org.example.calculator.operations.impl.MultiplyOperation;
import org.junit.jupiter.api.Test;

public class MultiplyOperationTest {

  @Test
  public void testMultiplyOperation() {
    MultiplyOperation multiplyOperation = new MultiplyOperation();
    double result = multiplyOperation.apply(2.0, 3.0);
    assertEquals(6.0, result);
  }

  @Test
  public void testMultiplyOperationWithZero() {
    MultiplyOperation multiplyOperation = new MultiplyOperation();
    double result = multiplyOperation.apply(5.0, 0.0);
    assertEquals(0.0, result);
  }
}
