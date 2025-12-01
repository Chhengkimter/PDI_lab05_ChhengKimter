import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

record Employee(String name, int age, String city) {
    public String toString() {
        return "%-15s %-10s %5d".formatted(name, city, age);
    }
}

public class ReadCSVfpV2 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("person_list.csv");

        List<Employee> employees = Files.lines(path)
                .skip(1)
                .map(line -> line.split(","))
                .map(parts -> new Employee(
                        parts[0],
                        Integer.parseInt(parts[1]),
                        parts[2]))
                .toList();
        employees.forEach(System.out::println);
    }
}
