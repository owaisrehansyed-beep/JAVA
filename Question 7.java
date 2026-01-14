import java.util.Scanner;

public class EvenOddChecker {
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer number: ");
            int n = scanner.nextInt();
            checkEvenOdd(n);
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}