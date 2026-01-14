import java.util.Scanner;

public class TrapezoidArea {
    public static double calculateArea(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter length of parallel side a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter length of parallel side b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter the perpendicular height between the sides: ");
            double h = scanner.nextDouble();

            double area = calculateArea(a, b, h);
            System.out.printf("The area of the trapezoid is: %.2f%n", area);
        } catch (Exception e) {
            System.out.println("Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}