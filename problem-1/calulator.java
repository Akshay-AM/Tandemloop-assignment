mport java.util.Scanner;

public class Calculator {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
            case "addition":
                return a + b;
            case "subtract":
            case "subtraction":
                return a - b;
            case "multiply":
            case "multiplication":
                return a * b;
            case "divide":
            case "division":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero.");
                    return Double.NaN; 
                }
            default:
                System.out.println("Error: Invalid operation.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        scanner.nextLine(); 
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.nextLine();

        double result = calc.calculate(a, b, operation);

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
