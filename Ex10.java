import java.util.Arrays;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<Integer> mixedNumbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);
        System.out.println("\nPositive numbers:");
        mixedNumbers.stream()
                .filter(x -> x > 0)
                .forEach(System.out::println);
    }
}
