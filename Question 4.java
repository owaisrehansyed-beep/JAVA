import java.util.Scanner;

public class OriginalPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input discounted selling price
        System.out.print("Enter the discounted selling price: ");
        double discountedPrice = input.nextDouble();

        // Input discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = input.nextDouble();

        // Calculate original selling price
        double originalPrice = discountedPrice / (1 - discountPercentage / 100);

        // Print the result
        System.out.printf("Original Selling Price: %.2f\n", originalPrice);

        input.close();
    }
}