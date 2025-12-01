
public class Ex5 {

    // Procedural factorial
    public static long factPro(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive factorial
    public static long factRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factRec(n - 1);
    }

    public static void main(String[] args) {
        int[] inputs = { 3, 6, 10, 50 };

        System.out.println("Factorial Comparison:");
        System.out.println("Input\tProcedural\tRecursive\n");

        for (int n : inputs) {
            long procResult = factPro(n);
            long recResult = factRec(n);

            System.out.println(n + "\t" + procResult + "\t\t" + recResult);
        }

    }
}
