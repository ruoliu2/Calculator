## Flexible Calculator



##### Overview

The Flexible Calculator is a Java implementation that supports various arithmetic operations, allows for chaining of operations, and is designed to be extensible and compatible with Inversion of Control (IoC) environments. 

## Design

1. ###### Operations Enum

The `Operation` enum defines the basic operations supported by the calculator:
- `ADD`
- `SUBTRACT`
- `MULTIPLY`
- `DIVIDE`



2. ###### Calculator Class

The `Calculator` class provides:
- **Basic Calculation Method**: `calculate(Operation op, Number num1, Number num2)` performs the specified operation between `num1` and `num2` and returns the result.
- **Chaining Operations**: Allows starting with an initial value and applying a series of operations sequentially using the `withInitialValue(double initialValue)` method followed by `chainingCalculate(Operation op, Number num)` and ending with `getResult()`.



3. ###### Extensibility

New operations can be added by:
- Implementing the `IOperation` interface.
- Adding a new entry in the `operations` map in the `Calculator` class.
- Updating the `Operation` enum.



4. ###### IoC Compatibility

The design is compatible with IoC by:
- Allowing dependency injection for the operations map.
- Facilitating easy swapping of operation implementations and testing.



5. ###### Error Handling

The calculator handles errors by:
- Throwing appropriate exceptions (e.g., `ArithmeticException` for division by zero).
- Providing meaningful error messages for unsupported operations.



6. ###### Design Pattern

Use strategy design pattern to modulize the operation interface, reduce coupling.

Use factory method pattern when creating calculator class to avoid coupling.

Use Chain of Responsibility Pattern to passing calculation along a chain of handlers.



7. ###### Testing

test both unit test on each operation, also on correct handling of unsupported operation and  chaining of operations

## Usage

###### Basic Calculation

```java
Calculator calculator = new Calculator();
double result = calculator.calculate(Operation.ADD, 5, 3);
System.out.println(result); // Outputs 8.0

Calculator calculator = new Calculator();
double result = calculator.withInitialValue(5.0)
                          .chainingCalculate(Operation.ADD, 3.0)
                          .chainingCalculate(Operation.MULTIPLY, 2.0)
                          .getResult();
System.out.println(result); // Outputs 16.0
```
