package org.example.calculator.enums;

import java.awt.*;

public enum Operation {
  ADD,
  SUBTRACT,
  MULTIPLY,
  DIVIDE;

  public static Operation safeValueOf(String name) {
    try {
      return Operation.valueOf(name);
    } catch (IllegalArgumentException | NullPointerException e) {
      return null;
    }
  }
}
