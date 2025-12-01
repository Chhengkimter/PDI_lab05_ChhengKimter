import java.util.Arrays;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("\nSorted numbers:");
        List<Integer> mixedNumbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);
        mixedNumbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}