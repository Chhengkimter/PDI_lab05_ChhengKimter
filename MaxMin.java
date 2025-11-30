import java.util.stream.*;
import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3, 8};
        
        System.out.println("Array: " + Arrays.toString(numbers));
        
        int max = IntStream.of(numbers).max().getAsInt();
        System.out.println("Max: " + max);
        
        int min = IntStream.of(numbers).min().getAsInt();
        System.out.println("Min: " + min);
    }
}