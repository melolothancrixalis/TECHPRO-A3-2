public class Seatwork7Part1 {
  public static void main(String[] args) {
    try {
   int num1 = 20;
   int num2 = 0;
   int result = num1 / num2;

   System.out.println(num1 + num2);
    } catch (ArithmeticException e) {
    System.out.println("Error: Cannot be divided by zero.");
    }
  }
}
