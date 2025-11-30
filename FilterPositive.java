import java.util.*;

public class FilterPositive {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(-5, 10, -3, 0, 15, -8, 3);
        
        System.out.println("Original list: " + numbers);
        
        System.out.println("Filtered list: ");
        numbers.stream()
               .filter(n -> n > 0)
               .forEach(n -> System.out.println(n + " "));
    }
} 
    

