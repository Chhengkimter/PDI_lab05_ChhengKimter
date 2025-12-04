public class factorial {
    // Recursive factorial
    public static long factorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0) return 1;  // Base case
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int[] inputs = {3, 6, 10, 50};
        System.out.println("Recursive Results:");
        for (int n : inputs) {
            try {
                System.out.println("Factorial of " + n + " is " + factorialRecursive(n));
            } catch (Exception e) {
                System.out.println("Error for " + n + ": " + e.getMessage());
            }
        }
    }
}
