package org.example;

import java.util.HashMap;
import java.util.Map;
import org.example.calculator.enums.Operation;
import org.example.calculator.operations.IOperation;
import org.example.calculator.operations.impl.AddOperation;
import org.example.calculator.operations.impl.DivideOperation;
import org.example.calculator.operations.impl.MultiplyOperation;
import org.example.calculator.operations.impl.SubtractOperation;

public class Main {
  public static void main(String[] args) {
    Map<Operation, IOperation> operations = new HashMap<>();
    operations.put(Operation.ADD, new AddOperation());
    operations.put(Operation.SUBTRACT, new SubtractOperation());
    operations.put(Operation.MULTIPLY, new MultiplyOperation());
    operations.put(Operation.DIVIDE, new DivideOperation());
  }
}
