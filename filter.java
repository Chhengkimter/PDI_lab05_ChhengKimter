import java.util.Arrays;
import java.util.List;

public class filter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 3, 0, 7, -2, 10, -1, 4);
        numbers.stream()
                .filter(n -> n > 0)
                .forEach(System.out::println);
    }
}

