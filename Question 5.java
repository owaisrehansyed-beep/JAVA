import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input voltage
        System.out.print("Enter the voltage (in volts): ");
        double voltage = input.nextDouble();

        // Input current
        System.out.print("Enter the current (in amperes): ");
        double current = input.nextDouble();

        // Calculate power in watts
        double power = voltage * current;

        // Print the result
        System.out.printf("Power Consumption: %.2f watts\n", power);

        input.close();
    }
}