import java.util.Scanner;

public class WeightingScale {
    public static void main(String[] args) {

        Scanner scale = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("--- Weight Conversion Program ---");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.println("Choose a weighting option");
        choice = scale.nextInt();

        if (choice == 1) {
            System.out.println("Enter the weight in lbs: ");
            weight = scale.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("The new weight in kgs is: " + newWeight);
        } else if (choice == 2) {
            System.out.println("Enter the weight in kgs: ");
            weight = scale.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("The new weight in lbs is: " + newWeight);
        } else {
            System.out.println("Not a valid choice.");
        }
        scale.close();
    }
}
