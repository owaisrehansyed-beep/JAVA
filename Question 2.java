import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate circumference
        double circumference = 2 * Math.PI * radius;

        // Calculate area
        double area = Math.PI * radius * radius;

        // Display the results
        System.out.printf("Circumference of the circle: %.2f\n", circumference);
        System.out.printf("Area of the circle: %.2f\n", area);

        scanner.close();
    }
}