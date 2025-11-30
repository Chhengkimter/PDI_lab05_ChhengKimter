import java.util.*;

public class CubeNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 1, 6);
        
        System.out.println("Original list: " + numbers);
        
        System.out.println("Filtered list:");
        numbers.stream()
               .map(n -> n * n * n)
               .forEach(System.out::println);
    }
}