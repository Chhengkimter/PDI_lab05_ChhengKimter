import java.util.Arrays;
import java.util.List;

public class Ex12 {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Heang", "Horng", "Satya", "Theary", "Kimter");
        System.out.println("\nStudents sorted A-Z:");
        students.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
