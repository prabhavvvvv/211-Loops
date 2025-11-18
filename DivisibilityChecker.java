public class DivisibilityChecker {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else if (dividend % divisor == 0) {
            int quotient = dividend / divisor;
            System.out.println(dividend + " is evenly divisible by " + divisor + ".");
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println(dividend + " is not evenly divisible by " + divisor + ".");
            System.out.println("Remainder: " + (dividend % divisor));
        }

        sc.close();
    }
}
