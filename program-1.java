class Calculator {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {

            case "add":
            case "+":
                return a + b;

            case "subtract":
            case "-":
                return a - b;

            case "multiply":
            case "*":
                return a * b;

            case "divide":
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid operation type!");
                return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        double a = 10.0;
        double b = 5.0;

        System.out.println("Addition: " + calc.calculate(a, b, "add"));
        System.out.println("Subtraction: " + calc.calculate(a, b, "subtract"));
        System.out.println("Multiplication: " + calc.calculate(a, b, "multiply"));
        System.out.println("Division: " + calc.calculate(a, b, "divide"));
    }
}
