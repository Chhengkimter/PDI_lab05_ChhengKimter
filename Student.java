import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Student class for encapsulation
class Student {
    private String name;
    private int id;
    private int age;
    private String gender;

    public Student(String name, int id, int age, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    // Getters for display
    public String getName() { return name; }
    public int getId() { return id; }
    public int getAge() { return age; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Age: " + age + ", Gender: " + gender;
    }
}

// Thread 1: Calculate sum from 1 to n
class SumThread extends Thread {
    private int n;

    public SumThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + n + " is: " + sum);
    }
}

// Thread 2: Find primes between 1 and 100
class PrimeThread extends Thread {
    @Override
    public void run() {
        System.out.print("Prime numbers between 1 and 100: ");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

// Thread 3: Read CSV and store in ArrayList
class CsvThread extends Thread {
    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String name = parts[0].trim();
                    int id = Integer.parseInt(parts[1].trim());
                    int age = Integer.parseInt(parts[2].trim());
                    String gender = parts[3].trim();
                    students.add(new Student(name, id, age, gender));
                }
            }
            System.out.println("Students from CSV:");
            for (Student s : students) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}

