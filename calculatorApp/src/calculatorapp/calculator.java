package calculatorapp;

public class calculator {
    
    // Arithmetic Operations
    // Square
   public double square(double a) {
    return a * a;
   }

   // Power (x^y)
    public double power(double a, double b) {
    return Math.pow(a, b);
   }

    // Factorial (n!)
    public long factorial(int n) {
    if (n < 0) {
        throw new ArithmeticException("Factorial not defined for negative numbers!");
    }
    long fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
    }
    
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    // Percentage (num1 ka percentage num2 ka)
    public double percentage(double a, double b) {
        return (a * b) / 100;
    }

    // Scientific Operations
    public double sin(double a) {
        return Math.sin(Math.toRadians(a)); // degree input
    }

    public double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }
}
