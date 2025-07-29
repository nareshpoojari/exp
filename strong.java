public class strong {

    // Function to calculate the factorial of a number
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += calculateFactorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println("Strong numbers from 1 to 5000 are:");
        for (int i = 1; i <= 5000; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For a new line at the end
    }
}