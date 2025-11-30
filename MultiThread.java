import java.io.*;
import java.util.*;

class Sum extends Thread {
    public void run() {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}

class Prime extends Thread {
    public void run() {
        System.out.print("Primes: ");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Student {
    String name;
    int id;
    int age;
    String gender;
    
    Student(String name, int id, int age, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }
    
    public String toString() {
        return name + ", ID: " + id + ", Age: " + age + ", Gender: " + gender;
    }
}

class CSV extends Thread {
    public void run() {
        ArrayList<Student> students = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line;
            boolean first = true;
            
            while ((line = br.readLine()) != null) {
                if (first) {
                    first = false;
                    continue;
                }
                
                String[] data = line.split(",");
                if (data.length == 4) {
                    String name = data[0].trim();
                    int id = Integer.parseInt(data[1].trim());
                    int age = Integer.parseInt(data[2].trim());
                    String gender = data[3].trim();
                    
                    students.add(new Student(name, id, age, gender));
                }
            }
            br.close();
            
            System.out.println("Students read: " + students.size());
            for (Student s : students) {
                System.out.println(s);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Creating sample CSV file...");
            try {
                FileWriter fw = new FileWriter("students.csv");
                fw.write("Name,ID,Age,Gender\n");
                fw.write("me,101,20,Female\n");
                fw.write("him,102,21,Male\n");
                fw.close();
                System.out.println("CSV created. Run again.");
            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        Sum t1 = new Sum();
        Prime t2 = new Prime();
        CSV t3 = new CSV();
        
        t1.start();
        t2.start();
        t3.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        
        System.out.println("All threads done!");
    }
}