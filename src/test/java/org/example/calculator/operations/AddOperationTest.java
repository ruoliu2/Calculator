package org.example.calculator.operations;

import org.example.calculator.operations.impl.AddOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddOperationTest {

  @Test
  public void testAddOperation() {
    AddOperation addOperation = new AddOperation();
    double result = addOperation.apply(2.0, 3.0);
    assertEquals(5.0, result);
  }

  @Test
  public void testAddOperationWithNegativeNumbers() {
    AddOperation addOperation = new AddOperation();
    double result = addOperation.apply(-2.0, -3.0);
    assertEquals(-5.0, result);
  }
}
