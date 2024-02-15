public class Main {
    public static void main(String[] args) {
        // Test with the 10th fibonacci number 
        System.out.println(fibonacci(10));
    }

    // Method to compute the nth Fibonacci number
    public static int fibonacci(int n) {
        // The first two fibonacci numbers
        int a = 0, b = 1;

        // Return if n is 0 or 1
        if (n <= 0) return a;
        if (n == 1) return b;

        // Compute Fibonacci numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            // Next fibonacci number is sum of previous two
            int temp = a + b;
            // Replace a with b and b with temp (next fibonacci number)
            a = b;
            b = temp;
        }

        // Return the nth Fibonacci number
        return b;
    }
}