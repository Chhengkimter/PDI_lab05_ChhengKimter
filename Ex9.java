import java.util.Arrays;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        // Exercise 9: Cube of each number
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Cubes:");
        numbers.stream()
                .map(x -> x * x * x)
                .forEach(System.out::println);
    }
}
