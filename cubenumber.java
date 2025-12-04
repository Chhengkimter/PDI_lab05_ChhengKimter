import java.util.Arrays;
import java.util.List;

public class cubenumber {
    public static void main(String[] args) {
        // Sample list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Functional approach: Stream the list, cube each number, and print
        numbers.stream()
                .map(n -> n * n * n)  // Cube each number using lambda
                .forEach(System.out::println);  // Print each result using method reference
    }
}
