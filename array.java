import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class array {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3, 8};
        OptionalInt max = IntStream.of(numbers).max();
        max.ifPresent(value -> System.out.println("Maximum: " + value));

        OptionalInt min = IntStream.of(numbers).min();
        min.ifPresent(value -> System.out.println("Minimum: " + value));
        System.out.println("Max (with default): " + max.orElse(Integer.MIN_VALUE));
        System.out.println("Min (with default): " + min.orElse(Integer.MAX_VALUE));

        System.out.println("Max: " + IntStream.of(numbers).max().getAsInt());
        System.out.println("Min: " + IntStream.of(numbers).min().getAsInt());
    }
}
