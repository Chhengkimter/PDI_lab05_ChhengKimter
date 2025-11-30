import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);
        
        System.out.println("Original list: " + numbers);
        
        System.out.println("\nSorted list:");
        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}