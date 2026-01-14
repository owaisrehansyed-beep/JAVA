import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input obtained marks
        System.out.print("Enter the total obtained marks: ");
        double obtainedMarks = input.nextDouble();

        // Input maximum marks
        System.out.print("Enter the maximum marks: ");
        double maximumMarks = input.nextDouble();

        // Calculate percentage
        double percentage = (obtainedMarks / maximumMarks) * 100;

        // Print result
        System.out.printf("Percentage: %.2f%%\n", percentage);

        input.close();
    }
}