package org.example.calculator.operations;

import org.example.calculator.operations.impl.DivideOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivideOperationTest {

  @Test
  public void testDivideOperation() {
    DivideOperation divideOperation = new DivideOperation();
    double result = divideOperation.apply(6.0, 2.0);
    assertEquals(3.0, result);
  }

  @Test
  public void testDivideOperationByZero() {
    DivideOperation divideOperation = new DivideOperation();
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          divideOperation.apply(5.0, 0.0);
        });
  }
}
