public class Seatwork4Part2 {
    public int calculateArea(int side) {
        return side * side;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Main class below
    public static void main(String[] args) {
        Sw4part2 calc = new Sw4part2();

        int squareArea = calc.calculateArea(5);
        double rectangleArea = calc.calculateArea(4.0, 6.0);

        System.out.println("Square area: " + squareArea);
        System.out.println("Rectangle area: " + rectangleArea); 
    }
}
