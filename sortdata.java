import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortdata {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);
        List<Integer> ascending = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Ascending: " + ascending);

        List<Integer> descending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Descending: " + descending);
        List<Integer> byAbsoluteValue = numbers.stream()
                .sorted(Comparator.comparingInt(Math::abs))
                .collect(Collectors.toList());
        System.out.println("By absolute value: " + byAbsoluteValue);

        System.out.print("Positive numbers sorted: ");
        numbers.stream()
                .filter(n -> n > 0)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("Original: " + numbers);
    }
}
