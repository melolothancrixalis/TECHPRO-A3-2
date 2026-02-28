import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner calcu = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean valid = true;

        System.out.print("Enter the first number: ");
        num1 = calcu.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operator = calcu.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = calcu.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.println("Not an operator");
                valid = false;
            }
        }

        if (valid) {
            System.out.println(result);
        }

        calcu.close();
    }
}
