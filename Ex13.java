import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex13 {
    public static void main(String[] args) {
        int[] numArray = { 5, 2, 9, 1, 3, 8 };
        OptionalInt max = IntStream.of(numArray).max();
        OptionalInt min = IntStream.of(numArray).min();
        System.out.println("\nMax: " + max.getAsInt());
        System.out.println("Min: " + min.getAsInt());
    }

}
