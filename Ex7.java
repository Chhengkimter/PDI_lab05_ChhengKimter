import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class SumThread extends Thread {
    private int n;

    public SumThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + n + ": " + sum);
    }
}

class PrimeThread extends Thread {
    @Override
    public void run() {
        System.out.println("Prime numbers from 1 to 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

class CSVReaderThread extends Thread {
    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("person_list.csv"));
            String line;
            ArrayList<String[]> students = new ArrayList<>();
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                students.add(data);
            }
            reader.close();

            System.out.println("Students data loaded. Total: " + students.size());

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}

public class Ex7 {
    public static void main(String[] args) throws InterruptedException {
        SumThread t1 = new SumThread(100);
        PrimeThread t2 = new PrimeThread();
        CSVReaderThread t3 = new CSVReaderThread();

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads completed!");
    }
}
