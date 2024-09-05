package org.example.calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.example.calculator.enums.Operation;
import org.example.calculator.operations.IOperation;
import org.example.calculator.operations.impl.AddOperation;
import org.example.calculator.operations.impl.DivideOperation;
import org.example.calculator.operations.impl.MultiplyOperation;
import org.example.calculator.operations.impl.SubtractOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  private Calculator calculator;

  @BeforeEach
  public void setup() {
    Map<Operation, IOperation> operations = new HashMap<>();
    operations.put(Operation.ADD, new AddOperation());
    operations.put(Operation.SUBTRACT, new SubtractOperation());
    operations.put(Operation.MULTIPLY, new MultiplyOperation());
    operations.put(Operation.DIVIDE, new DivideOperation());

    calculator = new Calculator(operations);
  }

  @Test
  public void testChainingOperations() {
    double result =
        calculator
            .withInitialValue(5)
            .chainingCalculate(Operation.ADD, 3)
            .chainingCalculate(Operation.MULTIPLY, 2)
            .getResult();
    assertEquals(16.0, result);
  }

  @Test
  public void testUnsupportedOperation() {
    // Assuming there’s an unsupported operation in the enum or a missing entry in the map.
    assertThrows(
        UnsupportedOperationException.class,
        () -> {
          calculator.calculate(Operation.safeValueOf("POWER"), 2.0, 3.0);
        });
  }
}
