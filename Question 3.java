import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input original selling price
        System.out.print("Enter the original selling price: ");
        double originalPrice = input.nextDouble();

        // Input discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = input.nextDouble();

        // Calculate discounted selling price
        double discountedPrice = originalPrice - (originalPrice * discountPercentage / 100);

        // Print the result
        System.out.printf("Discounted Selling Price: %.2f\n", discountedPrice);

        input.close();
    }
}