import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionHandling {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("The input was not a number.");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero.");
        } catch (Exception e) {
            System.out.println("Something Went Wrong.");
        } finally {
            System.out.println("This always executes");
        }
    }
}
