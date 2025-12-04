import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class readname {
    public static void main(String[] args) {
        String fileName = "students.csv";

        try {
            List<String> sortedNames = Files.lines(Paths.get(fileName))
                    .skip(1) // Skip header row
                    .map(line -> {
                        String[] parts = line.split(",");
                        return parts.length > 0 ? parts[0].trim() : "";
                    })
                    .filter(name -> !name.isEmpty())
                    .sorted(String.CASE_INSENSITIVE_ORDER)
                    .collect(Collectors.toCollection(ArrayList::new));

            System.out.println("Student names sorted A-Z (case-insensitive):");
            sortedNames.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error reading file '" + fileName + "': " + e.getMessage());
            System.out.println("Please ensure the file exists in the current directory.");
        }
    }
}
