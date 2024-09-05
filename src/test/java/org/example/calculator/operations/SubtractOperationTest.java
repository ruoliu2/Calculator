package org.example.calculator.operations;

import org.example.calculator.operations.impl.SubtractOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubtractOperationTest {

  @Test
  public void testSubtractOperation() {
    SubtractOperation subtractOperation = new SubtractOperation();
    double result = subtractOperation.apply(5.0, 3.0);
    assertEquals(2.0, result);
  }

  @Test
  public void testSubtractOperationWithNegativeNumbers() {
    SubtractOperation subtractOperation = new SubtractOperation();
    double result = subtractOperation.apply(-5.0, -3.0);
    assertEquals(-2.0, result);
  }
}
