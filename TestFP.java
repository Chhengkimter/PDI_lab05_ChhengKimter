import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
    int ID;
    String name;

    Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    void print() {
        System.out.println(ID + " " + name);
    }
}

public class TestFP {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 5, 10, 0, -90);
        List<Student> list = Arrays.asList(
                new Student(20240041, "Heang"),
                new Student(20240050, "Horng"),
                new Student(20240007, "Kimter"),
                new Student(20240044, "Satya"),
                new Student(20240012, "Theary"));
        numbers.stream().sorted().forEach(System.out::println);
        System.out.println();

        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println();

        list.stream()
                .sorted(Comparator.comparing(n -> n.name))
                .forEach(Student::print);
        System.out.println();

        list.stream()
                .sorted(Comparator.comparingInt(n -> n.ID))
                .forEach(Student::print);
        System.out.println();

        list.stream()
                .sorted(Comparator.comparing((Student s) -> s.name).reversed())
                .forEach(Student::print);
        System.out.println();

        list.stream()
                .sorted(Comparator.comparingInt((Student s) -> s.ID).thenComparing(s -> s.name))
                .forEach(Student::print);
    }
}