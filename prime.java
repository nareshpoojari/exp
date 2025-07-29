public class prime {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        // Loop through numbers from 2 to 100
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            // Check for divisibility from 2 up to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break; // No need to check further
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}