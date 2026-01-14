public class HeronsFormula {
    public static double calculateArea(double a, double b, double c) {
        // Calculate semi-perimeter
        double s = (a + b + c) / 2;
        
        // Calculate area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        return area;
    }

    public static void main(String[] args) {
        double a = 3; // side 1
        double b = 4; // side 2
        double c = 5; // side 3
        
        double area = calculateArea(a, b, c);
        System.out.println("The area of the triangle is: " + area);
    }
}