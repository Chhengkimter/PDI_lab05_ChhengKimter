public class factorial {

    public static long factorialProcedural(int n) {
        long fact = 1;
        for (int j = 1; j <= n; j++) {
            fact *= j;
        }
        return fact;
    }

    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    
    public static void main(String[] args) {
        int[] n = {3, 6, 10, 50};
        
        System.out.println("Factorial Results\n");
        System.out.println(String.format("%-10s %-20s %-20s", "Input", "Procedural", "Recursive"));
        System.out.println("-".repeat(55));
        
        for (int i = 0; i < n.length; i++) {
            long procedural = factorialProcedural(n[i]);
            long recursive = factorialRecursive(n[i]);
            
            System.out.println(String.format("%-10d %-20d %-20d", n[i], procedural, recursive));
        }
    }
}