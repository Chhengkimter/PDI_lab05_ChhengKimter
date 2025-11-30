import java.io.*;
import java.util.*;
import java.util.stream.*;

public class SortStudents {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            br.readLine(); 
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0) {
                    String name = data[0].trim();
                    names.add(name);
                }
            }
            br.close();
            
            System.out.println("Original names: " + names);
     
            System.out.println("\nSorted A-Z:");
            names.stream()
                 .sorted()
                 .forEach(System.out::println);
           
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}